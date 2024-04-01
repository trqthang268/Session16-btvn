package sort;

public class BublleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        boolean isNextPass = true; // 1,2,3,4,5,6,7,8,9; mảng có ít phần thử sai vị trí
        for (int i = 0; i <array.length-1 && isNextPass ; i++) {
            isNextPass = false;
            for (int j = 0; j <array.length-1-i; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isNextPass =true;
                }
            }
        }
    }
}
