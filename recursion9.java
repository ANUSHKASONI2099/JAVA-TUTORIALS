public class recursion9 {
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 8, 3, 3, 2, 5 };
        System.out.println(firstOccurence(arr, 5, 0));
    }
}
