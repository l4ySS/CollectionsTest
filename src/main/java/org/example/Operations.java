package org.example;

import java.util.List;

public class Operations {
    public static long Add(List list){
        long start = System.nanoTime();
        for (int i = 0; i < 4000; i++) {
            list.add(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;

        return time;
    }

    public static long Get(List list){
        long start = System.nanoTime();
        for (int i = 0; i < 4000; i++) {
            list.get(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;

        return time;
    }


    public static long Delete(List list){
        long start = System.nanoTime();
        for (int i = 3999; i >= 0; i--) {
            list.remove(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;
        return time;
    }




}
