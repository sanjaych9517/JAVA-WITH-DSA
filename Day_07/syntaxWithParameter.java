package Day_07;
import java.util.*;
// sum of 2 varuable using function
public class syntaxWithParameter {
    public static void sum(int a , int b){
         int sum = a +b;
         System.out.println(sum);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("plz enter first number : ");
        int num1 = sc.nextInt();
         System.out.print("plz enter second number : ");
        int num2 = sc.nextInt();
        sum(num1 , num2);
    }
}
