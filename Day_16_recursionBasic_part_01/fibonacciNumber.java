package Day_16_recursionBasic_part_01;

public class fibonacciNumber {
     public static int feb(int n){
        if(n==1 || n==2){
            return n;
        }
        return feb(n-1) + feb(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(feb(9));
    }
}
// time complexity O(N)  && space complexity O(2 ke power N) i.e exponential 