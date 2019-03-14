package thread;

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
            System.out.println("线程启动...");
        }
    }

    /**
     * 通过实现 runnable接口
     */
    public static class RunableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("线程启动1...");
        }
    }


    /**
     * 通过 futureTask 创建线程，可以设定返回值
     */
    public 

    /**
     * 主进程
     *
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        RunableTask runableTask = new RunableTask();
        runableTask.run();
        new Thread(runableTask).run();

    }
}
