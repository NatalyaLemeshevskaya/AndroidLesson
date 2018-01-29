package by.itacademy.Project.data;

public class DownLoaderMultithreading {

    //Константы адресов
    private  final String URL_XML ="http://kiparo.ru/t/shop.xml";
    private  final String URL_JSON ="http://kiparo.ru/t/shop.json";

    //Переменная должна быть volatile для использования в разных потоках
    private   volatile boolean isOk;

    public boolean isOk() {
        return isOk;
    }


    //Реализуем многопоточность
    public void download(){


        DownLoader downLoader = new DownLoader();

        Thread threadXML = new Thread(new Runnable() {
            @Override
            public void run() {
              isOk = downLoader.loader(URL_XML);
            }
        });

        Thread threadJSON = new Thread(new Runnable() {
            @Override
            public void run() {
               isOk = downLoader.loader(URL_JSON);
            }
        });

        threadXML.start();
        threadJSON.start();

        //Ждем пока потоки скачивания завершат свою работу
        try {
            threadJSON.join();
            threadXML.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        if(isOk){
//            System.out.println("Файлы успешно загружены");
//        }else {
//            System.out.println("Не удалось скачать файлы, можно попробовать позже");
//        }



    }




}
