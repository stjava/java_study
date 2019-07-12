package juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueTest {

    public static void main(String[] args) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
    }
}
