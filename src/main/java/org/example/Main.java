package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  Класс служит для сравнения производительности LinkedList и ArrayList.
 @author Slivkin Sergey
 @version 1.0
 */

public class Main {
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

        long time1 = Operations.Add(linked);
        long time2 = Operations.Add(array);

        long time3 = Operations.Get(linked);
        long time4 = Operations.Get(array);

        long time5 = Operations.Delete(linked);
        long time6 = Operations.Delete(array);
        String leftAlignFormat = "| %-9s | %-6s | %-16d |%n";

        System.out.format("+-----------+--------+------------------+%n");
        System.out.format("| Operation | type   | time             |%n");
        System.out.format("+-----------+--------+------------------+%n");
        System.out.format(leftAlignFormat, "Add", "linked", time1);
        System.out.format(leftAlignFormat, "Add", "array", time2);
        System.out.format(leftAlignFormat, "Get", "linked", time3);
        System.out.format(leftAlignFormat, "Get", "array", time4);
        System.out.format(leftAlignFormat, "Delete", "linked", time5);
        System.out.format(leftAlignFormat, "Delete", "array", time6);
        System.out.format("+-----------+--------+------------------+%n");
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

        Operations.Add(linked);
        Operations.Get(linked);
        Operations.Delete(linked);

        Operations.Add(array);
        Operations.Get(array);
        Operations.Delete(array);

        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Warming time: " + time);
    }
}