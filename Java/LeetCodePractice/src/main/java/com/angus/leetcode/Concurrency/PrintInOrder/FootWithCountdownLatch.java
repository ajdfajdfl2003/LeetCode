package com.angus.leetcode.Concurrency.PrintInOrder;

import java.util.concurrent.CountDownLatch;

public class FootWithCountdownLatch implements Foo {
    private final CountDownLatch countDownLatch1 = new CountDownLatch(1);
    private final CountDownLatch countDownLatch2 = new CountDownLatch(1);

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        countDownLatch1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        countDownLatch1.await();
        printSecond.run();
        countDownLatch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        countDownLatch2.await();
        printThird.run();
    }
}
