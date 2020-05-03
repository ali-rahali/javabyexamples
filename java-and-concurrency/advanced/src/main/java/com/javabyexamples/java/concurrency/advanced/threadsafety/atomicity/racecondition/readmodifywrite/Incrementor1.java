package com.javabyexamples.java.concurrency.advanced.threadsafety.atomicity.racecondition.readmodifywrite;

import com.javabyexamples.java.concurrency.advanced.common.annotation.NotThreadSafe;

@NotThreadSafe
public class Incrementor1 implements Incrementor {

    private int counter = 0;

    @Override
    public void increment() {
        counter++;
    }

    @Override
    public void reset() {
        counter = 0;
    }

    @Override
    public int get() {
        return counter;
    }
}
