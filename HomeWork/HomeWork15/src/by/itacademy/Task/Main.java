package by.itacademy.Task;

public class Main extends Thread {
    public static void main(String[] args) {

        Runnable runnable = new Main() {
            @Override
            public void run() {
               print10();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.setName("Thread1");
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();

    }

//    public static void print10(){
//        int kk=1;
//        for(int i = 0; i < 10; i++){
//            System.out.println(Thread.currentThread().getName());
//            for (int j=1;j<=10;j++){
//                System.out.print(" "+(kk++)+" ");
//            }
//            System.out.println();
//                            try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//        }
//    }

    public  synchronized void print10(){
        int kk=1;
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
            for (int j=1;j<=10;j++){
                System.out.print(" "+(kk++)+" ");
            }
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
