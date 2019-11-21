package com.angus.leetcode.Concurrency.PrintInOrder;

class FooWithoutConcurrency implements Foo {

    public FooWithoutConcurrency() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        printThird.run();
    }
}