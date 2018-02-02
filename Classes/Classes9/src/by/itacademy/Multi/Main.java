package by.itacademy.Multi;

import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    private static LinkedBlockingQueue<Integer> list;
    private static StringBuffer stringBuffer = new StringBuffer();
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Start main");


//        Thread1 thread1 = new Thread1();
//        thread1.start();
//
//        try {
//            Thread1.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        thread1.setFinish(true);
        //прервать выполнение программы
//        thread1.interrupt();


//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //все что внутри будет запущено в другом потоке
//                for(int i = 0;i<10; i++) {
//                    System.out.println("Thread2 i =" + i );
//
//                    test();
//
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        });

//        thread1.start();
//        thread2.start();


        //зависнуть в main пока не выполнятся 2 потока
        //ждет выполнения другога потока
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0;i<10; i++) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //все что внутри будет запущено в другом потоке
                for(int i = 0;i<10; i++) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });


        thread1.start();
        thread2.start();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.isAlive();
        //живет пока все поток не завершаться ,main закрывается
        thread1.setDaemon(true);




        System.out.println("End main ");


    }
    public synchronized static void openFile(){
        //свозвращает текущий поток
        Thread.currentThread().getName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
