package org.example;

import java.util.List;

/**
 *  Вспомогательный класс, необходимый для проведения тестов.
 @author Slivkin Sergey
 @version 1.0
 */

public class Operations {
    /**
     * Метод измеряющий время необходимое для добавления n элементов.
     * @param list Параметр списка (ArrayList/LinkedList)
     * @param n Параметр числа выполнения операций добавления
     * @return long Возвращает вычисленное время выполнения операций.
     */
    public static long Add(List list, int n){
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;

        return time;
    }

    /**
     * Метод измеряющий время необходимое для извлечения из списка n элементов.
     * @param list Параметр списка (ArrayList/LinkedList)
     * @param n Параметр числа выполнения операций извлечения
     * @return long Возвращает вычисленное время выполнения операций.
     */
    public static long Get(List list, int n){
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            list.get(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;

        return time;
    }

    /**
     * Метод измеряющий время необходимое для удаления из списка n элементов.
     * @param list Параметр списка (ArrayList/LinkedList)
     * @param n Параметр числа выполнения операций удаления
     * @return long Возвращает вычисленное время выполнения операций.
     */
    public static long Delete(List list, int n){
        long start = System.nanoTime();
        for (int i = n-1; i >= 0; i--) {
            list.remove(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;
        return time;
    }




}
