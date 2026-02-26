package Day_11_Sorting;

import Day_05.factorialOfAnumber;

public class countingSort {
   public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
        largest = Math.max(largest,arr[i]);
    }

    // store count of each element 
    int count[] = new int [largest +1];
    for(int i =0; i<arr.length; i++){
        count[arr[i]]++;
    }

    // Build a sorted Array.

     int j=0;
     for(int i =0; i<count.length; i++){
        while(count[i] >0){
            arr[j] =i;
            j++;
            count[i]--;
        }
     }
   }
   public static void printArr(int arr []){
      for(int  i =0; i<arr.length; i++){
    System.out.print( arr[i] +" ");
   }
   }
   public static void main(String[] args) {
    int arr [] = {5,4,1,1,1,3,2};
    countingSort(arr);
        printArr(arr);
   }
}
