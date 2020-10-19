package multithread.demo;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        synchronized (bz){
            while(true){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"包子");
                System.out.println("吃货已经吃完了"+bz.pi+bz.xian+"包子");
                bz.flag=false;
                System.out.println("==========");
                bz.notify();
            }
        }
    }
}
