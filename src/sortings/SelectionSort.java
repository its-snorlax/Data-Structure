package sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = new int[]{100, 50, 10, 30, 75, 85, 55, 15};
        selectionSort(input);
        printArray(input);
    }

    private static void printArray(int[] inputs) {
        for (int integer : inputs) {
            System.out.print(integer + " ");
        }
    }

    private static void selectionSort(int[] input) {
        int inputSize = input.length - 1;
        int position = 0;
        int positionForMinElement = 0;
        while (position < inputSize - 1) {
            for (int i = position; i <= inputSize; i++) {
                if (input[positionForMinElement] > input[i]) {
                    positionForMinElement = i;
                }
            }
            int temp = input[positionForMinElement];
            input[positionForMinElement] = input[position];
            input[position] = temp;
            position++;
        }
    }
}
