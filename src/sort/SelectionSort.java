package sort;

import java.util.Comparator;

public class SelectionSort {
    public static <T> void selectionSort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[indexMin], array[j]) > 0) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                T temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
            }
        }
    }
}
