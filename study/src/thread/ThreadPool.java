package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    private static ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);


    public static void main(String[] args) {

//        for (int i = 0; i <5 ; i++) {
//            scheduledExecutorService.execute(()->{
//                System.out.println(1);
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }

        for (int i = 0; i <5 ; i++) {
            scheduler.execute(() -> {
                System.out.println(2);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
//        scheduledExecutorService.scheduleAtFixedRate(() -> {
//            System.out.println("线程2");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, 0, 1, TimeUnit.SECONDS);
//
//        scheduler.scheduleAtFixedRate(() -> {
//            System.out.println("线程3");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, 0, 1, TimeUnit.SECONDS);

    }
}
