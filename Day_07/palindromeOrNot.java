package Day_07;

public class palindromeOrNot {
    public static void palindrome(int num){
        int lDigit;
        int reverse = 0;
        int  originalNum = num;
        while(num>0){
            lDigit = num%10;
            reverse = reverse*10 + lDigit;
            num/=10;
        }
        if(reverse == originalNum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(16461);
    }
}
