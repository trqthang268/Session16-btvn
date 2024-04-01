package search;

import java.util.Objects;

public class LinearSearch {
    public static <T> int linearSearch(T[] array , T t){
        for (int i = 0; i < array.length; i++) {
            if(Objects.equals(array[i],t)){
                return i;
            }
        }
        return -1;
    }
}
