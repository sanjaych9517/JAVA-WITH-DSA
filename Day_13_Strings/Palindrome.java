import java.util.*;
public class Palindrome {
        public static void PalindromeIsNot(String str){
            for (int i = 0; i < str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    System.out.println("Not Palindrome");
                    return;
                }
            }
            System.out.println("Palindrome");
        }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
             str = sc.nextLine();
        PalindromeIsNot(str);
    }
}
