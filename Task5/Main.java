package Collections.Task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int capacity = 100_000;
        ArrayList<Integer> list = new ArrayList<>(capacity);
        LinkedList<Integer> list2 = new LinkedList<>(list);
        Random random = new Random();

        System.out.print("Время затраченое на добавление элемента в начало коллекции ArrayList: ");
        Date beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list.add(0, random.nextInt(100));
        }
        Date afterCycle = new Date();
        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на добавление элемента в начало коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.addFirst(random.nextInt(100));
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.println("===========================================================================");

        System.out.print("Время затраченое на добавление элемента в конец коллекции ArrayList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(100));
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на добавление элемента в конец коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.addLast(random.nextInt(100));
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.println("===========================================================================");

        System.out.print("Время затраченое на получение элемента из коллекции ArrayList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list.get(i);
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на получение элемента из коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.get(i);
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на получение элемента из начала коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.getFirst();
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на получение элемента из конца коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.getLast();
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.println("===========================================================================");

        System.out.print("Время затраченое на удаление элемента из коллекции ArrayList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list.remove(i);
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на удаление элемента из коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.remove(i);
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        for (int i = 0; i < capacity; i++) {
            list2.addFirst(random.nextInt(100));
        }

        System.out.print("Время затраченое на удаление элемента из начала коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.removeFirst();
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        for (int i = 0; i < capacity; i++) {
            list2.addFirst(random.nextInt(100));
        }

        System.out.print("Время затраченое на удаление элемента из конца коллекции LinkedList: ");
        beforeCycle = new Date();
        for (int i = 0; i < capacity; i++) {
            list2.removeLast();
        }
        afterCycle = new Date();
        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);
    }

}
