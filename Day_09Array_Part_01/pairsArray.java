package Day_09Array_Part_01;

public class pairsArray {
    public static void printPairs(int arr[]){
        int tp = 0; // count total number of pairs
        for (int   i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for(int j = i+1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pairs = " + tp);
    }
    
    public static void main(String[] args) {
        int arr [ ] = {2,4,6,8,10};
        printPairs(arr);
    }
}
