package dream;

import java.util.Arrays;

/**
 * sort a array containing 0, 1 and 2
 */
public class SortNumbers {
    public static void main(String[] args) {
        int[] array = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));

        sort2(array);
        System.out.println(Arrays.toString(array));
    }

    public static void Sort012(int[] inputArray, int end) {
        int low = 0, mid = 0, high = inputArray.length - 1;

        //Until mid doesn't cross high
        while (mid <= high) {
            //If an element is 0, bring it to the beginning
            if (inputArray[mid] == 0) {
                swap(inputArray, low, mid);
                low++;
                mid++;
            } else if (inputArray[mid] == 2) {
                swap(inputArray, mid, high);
                high--;
            } else {
                mid++; //If an element is 1, let it be there only
            }
        }
    }

    private static void swap(int[] inputArray, int i, int j) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }

    public static void sort2(int[] arr) {
        int c1 = 0, c2 = 0, c3 = 0;

        for (int i : arr) {
            switch (i) {
                case 0: {
                    c1++;
                    break;
                }
                case 1: {
                    c2++;
                    break;
                }
                case 2: {
                    c3++;
                    break;
                }
            }
        }

        int i = 0;

        while (c1 > 0) {
            arr[i++] = 0;
            c1--;
        }

        while (c2 > 0) {
            arr[i++] = 1;
            c2--;
        }

        while (c3 > 0) {
            arr[i++] = 2;
            c3--;
        }
    }
}
