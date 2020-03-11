package com.angus.leetcode.data.structure;

import org.junit.Assert;
import org.junit.Test;

public class MyCircularQueueTest {
    @Test
    public void test1() {
//["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
//[[6]              ,[6]      ,[]    ,[]    ,[]       ,[5]      ,[]    ,[]       ,[]     ,[]       ,[]       ,[]]
//[null             ,true     ,6     ,6     ,true     ,true     ,5     ,true     ,-1     ,false     ,false   ,false]
        MyCircularQueue circularQueue = new MyCircularQueue(6);
        Assert.assertTrue(circularQueue.enQueue(6));
        Assert.assertEquals(6, circularQueue.Rear());
        Assert.assertTrue(circularQueue.deQueue());
        Assert.assertTrue(circularQueue.enQueue(5));
        Assert.assertEquals(5, circularQueue.Rear());
        Assert.assertTrue(circularQueue.deQueue());
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.Rear());
        Assert.assertEquals(-1, circularQueue.Front());
        Assert.assertFalse(circularQueue.deQueue());
        Assert.assertFalse(circularQueue.deQueue());
        Assert.assertFalse(circularQueue.deQueue());
    }

    @Test
    public void test() {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        Assert.assertTrue(circularQueue.enQueue(1));

        Assert.assertTrue(circularQueue.enQueue(2));
        Assert.assertTrue(circularQueue.enQueue(3));
        Assert.assertFalse(circularQueue.enQueue(4));
        Assert.assertEquals(3, circularQueue.Rear());
        Assert.assertTrue(circularQueue.isFull());
        Assert.assertTrue(circularQueue.deQueue());
        Assert.assertTrue(circularQueue.enQueue(4));
        Assert.assertEquals(4, circularQueue.Rear());
    }
}