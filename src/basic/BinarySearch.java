package basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 50;

        System.out.println(binarySearchIndex(arr, key));
    }

    private static int binarySearchIndex(int[] arr, int key) {
        int first = 0, last = arr.length - 1;


        while (first <= last) {
            int mid = (last + first) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] > key) {
                last = mid - 1;
            }
        }
        if (first > last) {
            throw new RuntimeException("Element is not found!");
        }
        return 0;
    }
}
