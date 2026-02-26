package Day_09Array_Part_01;

public class binarySearch {
    public static int binarySearch(int number[], int key){
         int start = 0; int end = number.length -1;
       
         while (start<=end) {
            int mid = (start+end)/2;
            if(number[mid] == key){
                 return mid;
            }
            if( number[mid] > key){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int number [] = {2,3,5,7,8,10,12,13,14,16,17,19,20};
        int key = 7;

        int output = binarySearch(number, key);
        System.out.println(" Number at index of : " + output);
    }
}
