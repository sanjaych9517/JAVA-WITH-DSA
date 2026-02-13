package Day_07;
import java.util.*;
public class averageOf3Numbers {
    public static int avg(int a, int b, int c){
        int averaeg = (a+b+c)/3;
        return averaeg;
    }
          
          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(avg(a,b,c));

          }
}
