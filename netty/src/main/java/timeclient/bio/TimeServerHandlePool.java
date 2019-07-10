package timeclient.bio;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TimeServerHandlePool {

    private ExecutorService executorService;

    /**
     * 初始化线程池
     *
     * @param maxPool
     * @param size
     */
    public TimeServerHandlePool(int maxPool, int size) {
        int coreSize = Runtime.getRuntime().availableProcessors();
        this.executorService = new ThreadPoolExecutor(coreSize,
                maxPool, 120, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(size));
    }

    /**
     * 线程池执行
     *
     * @param task
     */
    public void execute(Runnable task) {
        executorService.execute(task);
    }
}
