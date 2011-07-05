package com.google.code.java.core.primitives;

public class PrimitiveMain {
    public static void main(String... args) throws InterruptedException {
        while (true) {
            performTest();
            Thread.sleep(100);
        }
    }

    private static void performTest() {
        long start = System.nanoTime();
        int[] counters = new int[144];
        int runs = 20 * 1000;
        for (int i = 0; i < runs; i++) {
            int x = i % 12;
            int y = i / 12 % 12;
            int times = x * y;
            counters[times]++;
        }
        long time = System.nanoTime() - start;
        System.out.printf("Took %,d ns per loop%n", time / runs);
    }
}