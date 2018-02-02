package by.itacademy.Multi.Multi2;

public class Main {
     // локальная копия переменной у каждого потока не создается
    //
   private volatile String value;
    public static void main(String[] args) {

//
//
//        ParsingThead parsingThead = new ParsingThead();
//        DownThead downThead = new DownThead();
//
//        parsingThead.setDownThead(downThead);
//        downThead.setParsingThead(parsingThead);
//
//
//        parsingThead.start();
//        downThead.start();


        Main main = new Main();

      Thread thread1 = new Thread(new Runnable() {
          @Override
          public void run() {
              main.value = "aaaaaa";
//              Main main = new Main();
//              main.print10();
              System.out.println(main.value);

          }
      });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.value = main.value + "bbbbb";
//                Main main = new Main();
//                main.print10();
                System.out.println(main.value);

            }
        });


                  thread1.start();
                  thread2.start();


    }
    public  void print10(){

        //synchronized(object) {

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "i = " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           // }
        }
    }

}
