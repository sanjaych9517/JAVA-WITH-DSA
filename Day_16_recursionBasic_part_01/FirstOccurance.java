package Day_16_recursionBasic_part_01;

// write a programm to find first occurance in java
public class FirstOccurance {
    public static int firstoccurence(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 9, 3, 8, 6, 9, 3, 1 };
        int res = firstoccurence(arr, 0, 8);
        System.out.println(res);
    }
}

// time complexity & space complexity is program ke liya same hai i.e O(N)
