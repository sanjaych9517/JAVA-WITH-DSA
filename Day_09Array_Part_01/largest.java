package Day_09Array_Part_01;

public class largest {
    public static int getLarge(int num[]){
       int largest = Integer.MIN_VALUE;
       for (int i = 0; i < num.length; i++) {
        if(largest < num[i]){
            largest = num[i];
        }
       }
       return largest;
    }
    public static void main(String[] args) {
        int num[] = {1, 5,2,7,76,89,87,45,23,54,23,34,100,58,85,67,95,};
        System.out.println(getLarge(num));
    }
}
