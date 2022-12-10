package Collections.Task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int capacity = 1_000_000;
        ArrayList<Integer> arrayList = new ArrayList<>(capacity);
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        Random random = new Random();

        fillList(arrayList, capacity);
        fillList(linkedList, capacity);

        System.out.print("Время затраченое на добавление элемента в начало коллекции ArrayList: ");
        Date beforeCycle = new Date();

        arrayList.add(0, random.nextInt(100));

        Date afterCycle = new Date();

        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на добавление элемента в начало коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.addFirst(random.nextInt(100));

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.println("===========================================================================");

        System.out.print("Время затраченое на добавление элемента в конец коллекции ArrayList: ");
        beforeCycle = new Date();

        arrayList.add(random.nextInt(100));

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на добавление элемента в конец коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.addLast(random.nextInt(100));

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.println("===========================================================================");

        System.out.print("Время затраченое на получение элемента из коллекции ArrayList: ");
        beforeCycle = new Date();

        arrayList.get(0);

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на получение элемента из коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.get(0);

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на получение элемента из начала коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.getFirst();

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на получение элемента из конца коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.getLast();

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.println("===========================================================================");

        System.out.print("Время затраченое на удаление элемента из коллекции ArrayList: ");
        beforeCycle = new Date();

        arrayList.remove(0);

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на удаление элемента из коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.remove(0);

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на удаление элемента из начала коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.removeFirst();

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        System.out.print("Время затраченое на удаление элемента из конца коллекции LinkedList: ");
        beforeCycle = new Date();

        linkedList.removeLast();

        afterCycle = new Date();

        elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);
    }

    public static void fillList(List list, int capacity) {
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(100));
        }
    }
}
