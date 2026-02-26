package Day_11_Sorting;

public class insertionSort {
     public static void insertionSort(int num []){
        for(int i =1; i<num.length;i++){
         int curr = num[i];
         int prev = i-1;
          while(prev >=0 && num[prev] > curr){
              num[prev+1] = num[prev];
        prev--;
           }
           num[prev+1]= curr;
       }
    }

     public static void printArr(int num[]){
           for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
           }
           System.out.println();
        }
    public static void main(String[] args) {
         int num [ ] = {2,7,5,34,86,9, 1, 56, 43,23,75,56,65};
        insertionSort(num);
        printArr(num);
    }
}
