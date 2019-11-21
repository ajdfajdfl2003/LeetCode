package com.angus.leetcode.Concurrency.PrintInOrder;

public class FooWithSynchronized {
    private int i;

    public FooWithSynchronized() {
        i = 1;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        while (i != 1) {
            wait();
        }

        printFirst.run();

        i = 2;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (i != 2) {
            wait();
        }

        printSecond.run();

        i = 3;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (i != 3) {
            wait();
        }

        printThird.run();
    }
}
