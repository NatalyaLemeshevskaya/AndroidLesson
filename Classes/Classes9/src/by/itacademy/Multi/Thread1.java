package by.itacademy.Multi;

public class Thread1 extends Thread {

//
//    private boolean isFinish = false;
//
//    public void setFinish(boolean finish) {
//        isFinish = finish;
//    }

    @Override
    public void run() {
        for(int i = 0;i<10; i++) {

//            if(isFinish)return;
            if(isInterrupted()){
                System.out.println("stop by if");
                return;
            }

            System.out.println("Thread1 i =" + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("stop by InterruptedException ");

                return;
            }
        }


    }
}
