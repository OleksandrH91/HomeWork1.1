package Collections.Task7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[200_0];

        fillArray(array);
        SortClass.bubbleSort(array);
        System.out.println(Arrays.toString(array));

        fillArray(array);
        SortClass.selectionSort(array);
        System.out.println(Arrays.toString(array));

        fillArray(array);
        SortClass.quickSort(array) ;
        System.out.println(Arrays.toString(array));

        fillArray(array);
        SortClass.insertSort(array);
        System.out.println(Arrays.toString(array));

        fillArray(array);
        SortClass.shuttleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
