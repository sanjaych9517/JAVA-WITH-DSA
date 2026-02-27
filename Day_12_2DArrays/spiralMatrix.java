package Day_12_2DArrays;

import java.util.Scanner;

import Day_07.sumOfLastDigit;

public class spiralMatrix {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
       while(startRow<=endRow && startCol <= endCol){
         for (int j = startCol; j <=endCol; j++) {
            System.out.print(matrix[startRow][j] + " ");
        }
        for (int i = startRow+1; i <= endRow; i++) {
            System.out.print(matrix[i][endCol] + " ") ;
        }
        for(int j = endCol-1; j >=startCol; j--){
            if(startRow == endRow){
                break;
            }
            System.out.print(matrix[endRow] [j] + " ");
        }
        for(int i = endRow-1; i>startRow; i--){
            if(startCol == endCol){
                break;
            }
            System.out.print(matrix[i][startCol] + " ");
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
       }
       System.out.println();
    }
    

    public static void main(String [] args){
        int matrix [][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        int key = 23;
        int n = matrix.length;
        int m =  matrix[0].length;
        // input in matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                matrix[i][j]= sc.nextInt();
           }
        }

        // output of matrix
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
        }
        // function calling
      spiralMatrix(matrix);
    }
}
