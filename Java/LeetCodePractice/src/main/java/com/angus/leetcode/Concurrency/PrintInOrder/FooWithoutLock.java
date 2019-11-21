package com.angus.leetcode.Concurrency.PrintInOrder;

class FooWithoutLock {

    private volatile int i;

    public FooWithoutLock() {
        i = 1;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (i != 1) ;
        printFirst.run();
        i = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (i != 2) ;
        printSecond.run();
        i = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (i != 3) ;
        printThird.run();
    }
}