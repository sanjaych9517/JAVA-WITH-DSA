package Day_05;
import java.util.Scanner;
public class sumOfEvenAndSumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int esum =0 , osum =0;
        for( int i = 1 ; i <= num ; i++){
            if(i % 2 ==0){
                esum +=i;
            }
            else{
                osum+=i;
            }
        }
        System.out.println("sum of even number = " + esum);
        System.out.println("sum of odd number = " + osum);
    }
}
