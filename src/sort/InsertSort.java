package sort;

import java.util.Comparator;

public class InsertSort {
    public  static <T> void insertSort(T[] array, Comparator<T> comparator){
        for (int i = 1; i <array.length ; i++) {
            T insert = array[i];
            int j =i-1;
            while ( j >=0 && comparator.compare(insert,array[j])<0 ) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = insert;
        }
    }
}
