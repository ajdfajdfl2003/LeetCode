package com.angus.leetcode.Concurrency.PrintInOrder;

import java.util.concurrent.CountDownLatch;

public class FootWithCountdownLatch implements Foo {
    CountDownLatch countDownLatch1;
    CountDownLatch countDownLatch2;

    public FootWithCountdownLatch() {
        countDownLatch1 = new CountDownLatch(1);
        countDownLatch2 = new CountDownLatch(2);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        countDownLatch1.countDown();
        countDownLatch2.countDown();
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
