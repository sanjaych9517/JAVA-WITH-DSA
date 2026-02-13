package Day_05;
import java.util.Scanner;
public class reverseTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the nomber : ");
        int num = sc.nextInt();
        int ldigit , rev = 0;
        while( num > 0){
           ldigit = num % 10;
           rev = (rev*10) + ldigit;
           num = num/10;
           
        }
       System.out.print( "rev of given number : " + rev);
    }
}
