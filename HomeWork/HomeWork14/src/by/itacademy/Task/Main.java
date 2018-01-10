package by.itacademy.Task;

import com.mpatric.mp3agic.*;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {


        File musicBox = new File("C://Users//Nataly//Documents//Баста - Баста 5. Часть 2 (2016)");
        List<Mp3File> mp3FileList = new ArrayList();

        for(File file: musicBox.listFiles()){
            Pattern p = Pattern.compile(".+[.mp3]");
            Matcher m = p.matcher(file.getName());
            if(m.matches()){
                try {
                    mp3FileList.add(new Mp3File(file.getAbsolutePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (UnsupportedTagException e) {
                    e.printStackTrace();
                } catch (InvalidDataException e) {
                    e.printStackTrace();
                }

            }
        }
        outputInfo(mp3FileList);
       findTheSame(mp3FileList);

    }

    public static void outputInfo(List<Mp3File> mp3Files){

        for(int i = 0; i<mp3Files.size();i++) {

            String artist = mp3Files.get(i).getId3v2Tag().getArtist();
            String album = mp3Files.get(i).getId3v2Tag().getAlbum();
            String song = mp3Files.get(i).getId3v2Tag().getTitle();
            long duration = mp3Files.get(i).getLengthInSeconds();
            String path = mp3Files.get(i).getFilename();

            System.out.println("Исполнитель : " + artist);
            System.out.println("Альбом : " + album);
            System.out.println("Композиция  : " + song);
            System.out.println("Длительность  : " + duration + " (" + path + ")");


                 while ((artist.equals(mp3Files.get(i + 1).getId3v2Tag().getArtist())) &
                         (mp3Files.get(i).getId3v2Tag().getAlbum().equals(mp3Files.get(i+1).getId3v2Tag().getAlbum()))) {

                    System.out.println("Композиция  : " + mp3Files.get(i+1).getId3v2Tag().getTitle());
                    System.out.println("Длительность  : " + mp3Files.get(i+1).getLengthInSeconds() + " (" + mp3Files.get(i+1).getFilename() + ")");
                    i++;

                    if (i == mp3Files.size() - 1) {
                        break;
                    }
               }

        }


    }
    public static byte[] checkSum(String file) throws NoSuchAlgorithmException, IOException {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            }
        byte[] b = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;

        do {
            numRead = inputStream.read(b);
            if (numRead > 0) {
                complete.update(b, 0, numRead);
            }
        } while (numRead != -1);

        inputStream.close();
        return complete.digest();

    }

    public static String parseCheckSum(String file) throws IOException, NoSuchAlgorithmException {
       byte b[] = checkSum(file);
       String checkSumString = "";
        for (int i=0; i < b.length; i++) {
            checkSumString = Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);

        }
     return checkSumString;
    }

    public static void findTheSame(List<Mp3File> mp3Files) throws IOException, NoSuchAlgorithmException {

        String checkSum1 = "";
        String checkSum2 = "";
        for (int i = 0; i < mp3Files.size(); i++) {
            checkSum1 = parseCheckSum(mp3Files.get(i).getFilename());

            for (int j = i + 1; j < mp3Files.size(); j++) {
                checkSum2 = parseCheckSum(mp3Files.get(j).getFilename());


                if (checkSum1.equals(checkSum2)) {
                    System.out.println("Дубликаты :");
                    System.out.println((mp3Files.get(i).getFilename()));
                    System.out.println((mp3Files.get(j).getFilename()));

                }
            }
        }
        }
}
