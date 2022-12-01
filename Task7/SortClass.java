package Collections.Task7;

import java.util.Date;

public class SortClass {

    public static int[] bubbleSort(int[] array) {
        System.out.println("Bobble Sort");

        Date beforeCycle = new Date();
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }

        Date afterCycle = new Date();
        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        return array;
    }

    public static int[] selectionSort(int[] array) {
        System.out.println("Selection Sort");

        Date beforeCycle = new Date();

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }

            int tmp = array[left];
            array[left] = array[minInd];
            array[minInd] = tmp;
        }

        Date afterCycle = new Date();
        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);

        return array;
    }


    public static void quickSort(int[] array) {
        System.out.println("Quick Sort");
        Date beforeCycle = new Date();

        quickSortArr(array, 0, array.length - 1);

        Date afterCycle = new Date();
        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);
    }
    public static int[] quickSortArr(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int border = array[(leftMarker + rightMarker) / 2];

        do {
            while (array[leftMarker] < border) {
                leftMarker++;
            }
            while (array[rightMarker] > border) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSortArr(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortArr(array, leftBorder, rightMarker);
        }

        return array;
    }

    public static int[] insertSort(int[] array) {
        System.out.println("Insert Sort");
        Date beforeCycle = new Date();

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }

        Date afterCycle = new Date();
        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);
        return array;
    }

    public static int[] shuttleSort (int[] array) {
        System.out.println("Shuttle Sort");
        Date beforeCycle = new Date();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                for (int j = i - 1; (j - 1) >= 0; j--) {
                    if (array[j] < array[j - 1]) {
                        tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }

        Date afterCycle = new Date();
        long elapsedTime = afterCycle.getTime() - beforeCycle.getTime();
        System.out.println(elapsedTime);
        return array;
    }
}
