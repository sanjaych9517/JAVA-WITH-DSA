package Day_11_Sorting;
import java.util.*;

public class bubbleSort {
    public static void bubbleSort(int num []  ){
            for (int i = 0; i < num.length-1; i++) {
                for(int j = 0;  j<num.length-1; j++){
                    if(num[j]> num[j+1]){
                        int temp = num[j];
                         num[j] = num[j+1];
                         num[j+1] = temp;

                    }
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
        int num [] = {4,67,54,45,1,67,98,23,54};
        bubbleSort(num);
        printArr(num);
    }
}
