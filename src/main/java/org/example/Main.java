package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  Класс служит для сравнения производительности LinkedList и ArrayList.
 @author Slivkin Sergey
 @version 1.0
 */

public class Main {
    /** Сколько раз выполнялись операции в тестах */
    public static int N = 10000;

    /**
     * Основной метод, проводящий тесты и выводящий результаты в консоль в виде таблицы.
     * @param args Не используется.
     */
    public static void main(String[] args) {
        LinkedList<Integer> linked1;
        linked1 = new LinkedList<Integer>();
        ArrayList<Integer> array1;
        array1 = new ArrayList<Integer>();

        WarmUp();


        LinkedList<Integer> linked;
        linked = new LinkedList<Integer>();
        ArrayList<Integer> array;
        array = new ArrayList<Integer>();

        long time1 = Operations.Add(linked, N);
        long time2 = Operations.Add(array, N);

        long time3 = Operations.Get(linked, N);
        long time4 = Operations.Get(array, N);

        long time5 = Operations.Delete(linked, N);
        long time6 = Operations.Delete(array, N);
        System.out.println("LinkedList");
        String leftAlignFormat = "| %-9s | %-7d | %-16d |%n";
        System.out.format("+-----------+---------+------------------+%n");
        System.out.format("| Operation | Times   | Time (nanoSec)   |%n");
        System.out.format("+-----------+---------+------------------+%n");
        System.out.format(leftAlignFormat, "Add", N, time1);
        System.out.format(leftAlignFormat, "Get", N, time3);
        System.out.format(leftAlignFormat, "Delete", N, time5);
        System.out.format("+-----------+---------+------------------+%n");
        System.out.println("ArrayList");
        System.out.format("+-----------+---------+------------------+%n");
        System.out.format("| Operation | Times   | Time (nanoSec)   |%n");
        System.out.format("+-----------+---------+------------------+%n");
        System.out.format(leftAlignFormat, "Add", N, time2);
        System.out.format(leftAlignFormat, "Get", N, time4);
        System.out.format(leftAlignFormat, "Delete", N, time6);
        System.out.format("+-----------+---------+------------------+%n");
    }

    /**
     * Прогрев JVM
     */
    public static void WarmUp(){
        LinkedList<Integer> linked;
        linked = new LinkedList<Integer>();
        ArrayList<Integer> array;
        array = new ArrayList<Integer>();
        long start = System.nanoTime();

        Operations.Add(linked, N);
        Operations.Get(linked, N);
        Operations.Delete(linked, N);

        Operations.Add(array, N);
        Operations.Get(array, N);
        Operations.Delete(array, N);

        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Warming time: " + time);
    }
}