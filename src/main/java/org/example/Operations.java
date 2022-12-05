package org.example;

import java.util.List;

/**
 *  Вспомогательный класс, необходимый для проведения тестов.
 @author Slivkin Sergey
 @version 1.0
 */

public class Operations {
    /**
     * Метод измеряющий время необходимое для добавления 4000 элементов.
     * @param list Параметр списка (ArrayList/LinkedList)
     * @return long Возвращает вычисленное время выполнения операций.
     */
    public static long Add(List list){
        long start = System.nanoTime();
        for (int i = 0; i < 4000; i++) {
            list.add(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;

        return time;
    }

    /**
     * Метод измеряющий время необходимое для извлечения из списка 4000 элементов.
     * @param list Параметр списка (ArrayList/LinkedList)
     * @return long Возвращает вычисленное время выполнения операций.
     */
    public static long Get(List list){
        long start = System.nanoTime();
        for (int i = 0; i < 4000; i++) {
            list.get(i);
        }
        long finish = System.nanoTime();

        long time = finish - start;

        return time;
    }

    /**
     * Метод измеряющий время необходимое для удаления из списка 4000 элементов.
     * @param list Параметр списка (ArrayList/LinkedList)
     * @return long Возвращает вычисленное время выполнения операций.
     */
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
