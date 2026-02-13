package Day_07;

public class sumOfLastDigit {
    public static int SLDigit(int n){
        int sum = 0;
        int lastdigit;
        while(n>0){
           lastdigit = n%10;
           sum+= lastdigit;
           n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(SLDigit(789));
    }
}
