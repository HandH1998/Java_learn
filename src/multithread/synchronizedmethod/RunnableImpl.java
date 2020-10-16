package multithread.synchronizedmethod;

public class RunnableImpl implements Runnable {
    private static int ticket=100;

    Object obj=new Object();
    @Override
    public void run() {
        System.out.println("this:"+this);//this  即创建的new Runnable对象
        while(true){
//            payTicket();
            payTicketStatic();
        }


    }

    //定义同步方法
//    public synchronized void payTicket(){
//        if(ticket>0){
//            //提高安全问题出现的概率
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
//            ticket--;
//        }
//    }
    //定义静态同步方法
//    public static synchronized void payTicketStatic(){
//        if(ticket>0){
//            //提高安全问题出现的概率
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
//            ticket--;
//        }
//    }

    //验证一下其实同步方法的锁对象即this：new Runnable()
//    public void payTicket(){
//        synchronized (this){
//            if(ticket>0){
//                //提高安全问题出现的概率
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
//                ticket--;
//            }
//        }
//    }

    //验证一下其实静态同步方法的锁对象是本类的class属性-->class文件对象
    public static void payTicketStatic(){
//        synchronized (this){//报错
        synchronized (RunnableImpl.class){
            if(ticket>0){
                //提高安全问题出现的概率
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
