package by.itacademy.Multi.Multi2;

public class ParsingThead extends Thread {

    private DownThead downThead;

    public void setDownThead(DownThead downThead) {
        this.downThead = downThead;
    }

    @Override
    public void run() {
        System.out.println("wait pars");

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //нас разбудили

        System.out.println("json pars");
        //parsing json

        //будим downThead
        //положить в блок синхронайз
        System.out.println("ping download from parsing");
        downThead.notify();

        //сами засыпаем пока нас не разбудят
        System.out.println("wait pars");

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pars xml");

        //парсинг xml
// wait() и notify() находится в оbj но почему, а не в thread



        //все методы кот есть в obj
    }
}
