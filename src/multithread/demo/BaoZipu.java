package multithread.demo;

public class BaoZipu extends Thread{
    private BaoZi bz;

    //用包子对象作为锁对象，唯一
    public BaoZipu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count=0;
        synchronized (bz){
            while(true){
                if(bz.flag==true){
                    try {//有包子进入等待状态
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    bz.pi="薄皮";
                    bz.xian="三鲜馅";
                }else{
                    bz.pi="冰皮";
                    bz.xian="牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产"+bz.pi+ bz.xian+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                //修改包子状态
                bz.flag=true;
                System.out.println("包子铺已经生产好了"+bz.pi+bz.xian+"包子");
                //唤醒吃货线程
                bz.notify();
            }
            }

    }
}
