public class insertion {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length-1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.err.println();

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 1, 2, 3 };
        insertionSort(arr);
        printArr(arr);
    }

}
