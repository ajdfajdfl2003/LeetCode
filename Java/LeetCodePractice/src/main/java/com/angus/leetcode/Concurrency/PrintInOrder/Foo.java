package com.angus.leetcode.Concurrency.PrintInOrder;

public interface Foo {
    void first(Runnable printFirst) throws InterruptedException;

    void second(Runnable printFirst) throws InterruptedException;

    void third(Runnable printFirst) throws InterruptedException;
}
