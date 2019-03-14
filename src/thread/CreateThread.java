package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的几种方式
 */
public class CreateThread {

    /**
     * 通过 继承thread 类来实现多线程
     */
    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("thread继承，线程启动...");
        }
    }

    /**
     * 通过实现 runnable接口
     */
    public static class RunableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("runnable,线程启动1...");
        }
    }


    /**
     * 通过 futureTask 创建线程，可以设定返回值
     */
    public static class CallAbleTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "支持回调返回的，线程启动2...";
        }
    }

    /**
     * 主进程
     *
     * @param args
     */
    public static void main(String[] args) {
        //1
        MyThread myThread = new MyThread();
        myThread.run();
        //2
        RunableTask runableTask = new RunableTask();
        runableTask.run();
        new Thread(runableTask).run();
        //3
        CallAbleTask callAbleTask = new CallAbleTask();
        try {
            String call = callAbleTask.call();
            System.out.println(call);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3-1 
        FutureTask<String> futureTask = new FutureTask<>(new CallAbleTask());
        new Thread(futureTask).start();
        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
