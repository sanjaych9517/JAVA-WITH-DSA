package Day_09Array_Part_01;
import java .util.*;
public class ArrayInputOutputUpdate {
    public static void main(String[] args) {
        int mark[] = new int [100];

        // input our mark
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your physics mark : ");
        mark[0] = sc.nextInt();

        System.out.print("Enter your chemistry mark : ");
        mark[1] = sc.nextInt();

        System.out.print("Enter your Math mark : ");
        mark[2] = sc.nextInt();

        // print our marks

        System.out.println("physics mark =" + mark[0]);
        System.out.println("Chemistry mark =" + mark[1]);
        System.out.println("Math  mark =" + mark[2]);
     // for updation 

         mark[2] =  mark[2]+1;    
         
           System.out.println("Math  mark =" + mark[2]);
    }
}
