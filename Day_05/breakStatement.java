package Day_05;
import java.util.Scanner;
public class breakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz inter number of time : ");
        int n = sc.nextInt();
        for(int i = 1; i<= n ; i++){
            if(i == 5){
                  break;
            }
             System.out.println("hellow world : " + i);
        }
    }
}
