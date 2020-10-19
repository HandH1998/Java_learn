package multithread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        //获取线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //创建线程任务
        RunnableImpl run=new RunnableImpl();
        //提交任务到线程池，并开启
        es.submit(run);
        es.submit(run);
        es.submit(run);
        es.submit(run);
        es.submit(run);
        es.submit(run);

        //销毁线程池
        es.shutdown();
    }
}
