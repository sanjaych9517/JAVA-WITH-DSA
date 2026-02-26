package Day_11_Sorting;
import java.util.Arrays;

public class inbultSort {
     public static void main(String[] args) {
         int num [ ] = {2,7,5,34,86,9, 1, 56, 43,23,75,56,65};
        Arrays.sort(num);
        printArr(num);
      
    }
     public static void printArr(int num[]){
           for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
           }
           System.out.println();
        }
   

}
