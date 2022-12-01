package Collections.Task7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[200_000];
        fillArray(array);

        SortClass.bubbleSort(array);

        fillArray(array);

        SortClass.selectionSort(array);

        fillArray(array);

        SortClass.quickSort(array) ;

        fillArray(array);

        SortClass.insertSort(array);

        fillArray(array);

        System.out.println(Arrays.toString(array));
        SortClass.shuttleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(int[] array) {
        Random random = new Random(100);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
