package Day_05;
import java.util.Scanner;
public class print1ToN {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number Where you want to print : ");
   int N = sc.nextInt();
   int i =1;
    while(i <= N){
      System.out.println (i );
      i++;
    }
    }
}
