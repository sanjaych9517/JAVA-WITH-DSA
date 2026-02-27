package Day_12_2DArrays;
import java.util.*;

public class searchMatrix {
    public static boolean searchInMatrix(int matrix [][] ,int  key){
for(int i =0; i < matrix.length; i++){
    for(int j = 0; j<matrix[0].length; j++){

        // compare value
        if(matrix[i][j] == key){
             System.out.println("Found at Index ("+ i + "," + j + ")");
            return true;
        }

    }
}
       System.out.println(" not found");
      return false ;
    
    }
     public static void main(String [] args){
        int matrix [][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        int key = 23;

        // input in matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= sc.nextInt();
           }
        }

        // output of matrix
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
        }
        // function calling
        searchInMatrix(matrix, key );
    }
}
