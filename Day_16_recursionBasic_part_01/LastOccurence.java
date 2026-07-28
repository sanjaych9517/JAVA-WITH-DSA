package Day_16_recursionBasic_part_01;

public class LastOccurence {

    public static int lastOccurence(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lastOccurence(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 87, 4, 2, 9, 45, 47, 34, 21, 45, 67, 98, 43, 76, 98, 45, 28, 87, };
        System.out.println(lastOccurence(arr, 0, 100));
    }
}
