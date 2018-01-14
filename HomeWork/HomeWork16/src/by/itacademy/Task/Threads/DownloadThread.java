package by.itacademy.Task.Threads;

import by.itacademy.Task.DownLoad.DownLoader;
import by.itacademy.Task.Main;
import by.itacademy.Task.entity.Root;

import static by.itacademy.Task.Main.*;


public class DownloadThread extends Thread {

    private final String LinkForXml = "http://kiparo.ru/t/shop.xml";
    private final String LinkForJson = "http://kiparo.ru/t/shop.json";

    DownLoader downLoader = new DownLoader();

    @Override
    public void run() {

        System.out.println("Start Download");

            System.out.println("Downloading XML...");
            downLoader.loader(LinkForXml);
            synchronized (object) {
            object.notify();
        }

            try {
                synchronized (object) {
                    object.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Downloading JSON...");
            downLoader.loader(LinkForJson);
            synchronized (object) {
            object.notify();
        }

        System.out.println("End Download");

    }
}
