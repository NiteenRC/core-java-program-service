package dream;

import java.util.Arrays;

public class SortNumbers {
    //sort a array containing 0, 1 and 2
//three-way Partitioning
    public static void Sort012(int[] array, int end) {
        int start = 0, mid = 0,pivot = 1;

        while (mid <= end) {
            if (array[mid] < pivot) { //current element is 0
                swap(array, start, mid);
                ++start;
                ++mid;
            } else if (array[mid] > pivot) { ////current element is 2
                swap(array, mid, end);
                --end;
            } else   //current element is 1
                ++mid;
        }
    }

    //Function to swap two elements array[i] and array[j] in the array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
