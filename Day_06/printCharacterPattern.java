package Day_06;
import java.util.*;
public class printCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz inter number of row : ");
        int row = sc.nextInt();
        for( int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print( "\t" +j);
            }
            System.out.println();
        }
    }
}
