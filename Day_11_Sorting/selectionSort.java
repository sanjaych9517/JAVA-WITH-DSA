package Day_11_Sorting;

public class selectionSort {
    public static void selectionSort(int num []){
           for (int i = 0; i < num.length-1; i++) {
             int minPos = i;
             for(int j = i+1; j<num.length; j++){
                if(num[minPos]> num[j]){
                    minPos= j;
                }

                // Swap
                int temp = num[minPos];
                num[minPos] = num[i];
                num[i] = temp;
            }
        }
    }
    public static void printArr(int num[]){
           for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
           }
           System.out.println();
        }
    public static void main(String[] args) {
        int num [ ] = {2,5,7,34,86,9, 1, 56, 43,23,75,56,65};
        selectionSort(num);
        printArr(num);
    }
}
