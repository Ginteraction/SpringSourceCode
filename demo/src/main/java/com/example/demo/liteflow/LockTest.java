package com.example.demo.liteflow;

import java.sql.SQLOutput;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private int n;
    private int current = 1;
    private ReentrantLock lock = new ReentrantLock();

    public LockTest(int n) {
        this.n = n;
    }


    public void printNumber(int num) {
        lock.lock();
        try {
            while (current <= n) {
                if (current % 3 == num) {
                    System.out.println("Thread " + num + ": " + current);
                    current++;
                    lock.notify();
                } else {
                    lock.wait();
                }
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        final int n = 100;
        final LockTest lockTest = new LockTest(n);

        Thread thread1 = new Thread(() -> {
            while (lockTest.current <= n) {
                lockTest.printNumber(0);
            }
        });

        Thread thread2 = new Thread(() -> {
            while (lockTest.current <= n) {
                lockTest.printNumber(1);
            }
        });

        Thread thread3 = new Thread(() -> {
            while (lockTest.current <= n) {
                lockTest.printNumber(2);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
