public class recursion1a {
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arrr[] = { 1, 2, 3, 5, 6, 7, 5 };
        System.out.println(lastOccurence(arrr, 5, 0));

    }
}
