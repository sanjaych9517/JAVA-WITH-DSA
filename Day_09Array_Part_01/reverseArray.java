package Day_09Array_Part_01;

public class reverseArray {

    public static void reverse(int number[]){
        int start =0;
        int end = number.length-1;
        int temp;

        while(start < end){
            temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }


    }
    public static void main(String[] args) {
         int number [] = {2,3,5,7,8,10,12,13,14,16,17,19,20};

         reverse(number);
         for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
         }
         System.out.println();
    }
}
