package Day_05;

import java.util.Scanner;

public class sumOfFirstNaturalNumber {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number Where you want to print : ");
   int N = sc.nextInt();
   int sum =0;
   int i =1;
    while(i <= N){
      sum+=i;
      i++;
    }
    System.out.println( "Sum of first " + N + " natural number : " +sum);
    }
}
