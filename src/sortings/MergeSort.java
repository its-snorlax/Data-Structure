package sortings;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {100, 80, 90, 60, 70, 10, 40,50};
        mergeSort(input, 0, input.length - 1);
        for (int integer :
                input) {
            System.out.print(integer + " ");
        }
    }

    private static void mergeSort(int[] input, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(input, low, mid);
            mergeSort(input, mid + 1, high);
            merge(input, low, mid, high);
        }
    }

    private static void merge(int[] input, int low, int mid, int high) {
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = input[i + low];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = input[i + mid + 1];
        }

        int j = 0, i = 0;
        int currentIndex = low;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                input[currentIndex] = left[i];
                i++;
            } else {
                input[currentIndex] = right[j];
                j++;
            }
            currentIndex++;
        }
        while (i < left.length) {
            input[currentIndex] = left[i];
            i++;
            currentIndex++;
        }
        while (j < right.length) {
            input[currentIndex] = right[j];
            j++;
            currentIndex++;
        }
    }
}
