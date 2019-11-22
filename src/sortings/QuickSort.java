package sortings;

class QuickSort {
    public static void main(String[] args) {
        int[] inputs = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(inputs, 0, inputs.length - 1);
        for (int input : inputs) {
            System.out.print(input + " ");
        }
    }

    private static void sort(int[] inputs, int low, int high) {
        if (low < high) {
            int partition = partitioning(inputs, low, high);
            sort(inputs, low, partition - 1);
            sort(inputs, partition + 1, high);
        }
    }

    private static int partitioning(int[] inputs, int low, int high) {
        int i = low + 1;
        int j = high;

        int pivot = inputs[low];
        while (i < j) {
            while (i <= j && inputs[i] < pivot) {
                i++;
            }

            while (j >= i && inputs[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(inputs, i, j);
            }
        }
        swap(inputs, low, j);
        return j;
    }


    private static void swap(int[] inputs, int i, int j) {
        int temp = inputs[i];
        inputs[i] = inputs[j];
        inputs[j] = temp;
    }
}