package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = new int[]{5, 2, 8, 1, 9};
        arr = selectionSort(arr);

        for (int el:arr) {
            System.out.print(el + " ");
        }

    }

    public static int[] selectionSort(int[] arr) {
        int minPosition;
        int minValue;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            minValue = arr[minPosition];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minPosition = j;
                    minValue = arr[j];
                }
            }
            swap(arr, minPosition, i);
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}