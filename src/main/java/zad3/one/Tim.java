package zad3.one;

import static java.lang.System.nanoTime;

public class Tim {

    private static double time;


    public static void start() {
        time = nanoTime();
    }

    public static void stop(int n, String method) {
        System.out.println(n + " times took " + (nanoTime()-time)/1_000_000 + "ms. for " + method);
        time = nanoTime();
    }

}
