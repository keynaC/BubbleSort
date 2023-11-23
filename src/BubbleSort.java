import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {11,54,56,87,89,5};

        System.out.println("Original String Array:" + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted String Array:" + Arrays.toString(array));
    }

    static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {

                    //swap temp and arr[i]
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    
                    arr[j + 1] = temp;
                }

            }
        }
    }
}
