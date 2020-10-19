package multithread.demo;

public class Demo {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        new BaoZipu(bz).start();
        new ChiHuo(bz).start();

    }
}
