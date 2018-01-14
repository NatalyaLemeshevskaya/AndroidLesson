package by.itacademy.Task;

import by.itacademy.Task.Threads.DownloadThread;
import by.itacademy.Task.Threads.ParsingThread;

public class Main {

    public final static Object object = new Object();
    public static void main(String[] args) {


        ParsingThread parsingThread = new ParsingThread();
        DownloadThread downloadThread = new DownloadThread();


        downloadThread.start();
        parsingThread.start();

    }
}
