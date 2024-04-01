package search;

import java.util.Objects;

public class BinarySearch {
    public static <T extends Comparable<T>> int indexOfNoRecursive(T[] array ,T t){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(Objects.equals(array[mid],t)){
                return mid;
            }
            if (array[mid].compareTo(t)<0){
                start = mid+1;
            }else {
                end =mid-1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int indexOfRecursive(T[] array,int start,int end ,T t){

        if (start<=end){
            int mid = start+(end-start)/2;
            if(Objects.equals(array[mid],t)){
                return mid;
            }
            if (array[mid].compareTo(t)<0){
                return indexOfRecursive(array,mid+1,end,t);
            }else {
                return indexOfRecursive(array,start,mid-1,t);
            }
        }
        return -1;
    }
}
