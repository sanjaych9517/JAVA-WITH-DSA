package Day_12_2DArrays;
public class question_03{
    public static void main(String[] args) {
        int row = 2, column = 3;
        int [][ ]matrix = { {3, 3, 7} , {5, 6, 7  } };
        // display original matrix
                
               Printmatrix(matrix);

        // Transpose of the matrix
        int [][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        //ptint transpose of matrix
        Printmatrix(transpose);
    }

    public static void Printmatrix(int [][] matrix){
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }
    }
}