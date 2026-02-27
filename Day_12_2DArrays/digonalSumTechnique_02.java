package Day_12_2DArrays;

public class digonalSumTechnique_02 {
     public static int diogonalSum02( int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            // primary diagonal sum 
            sum += matrix[i][i];
            // secondary diagonal
            if( i != matrix.length -1-i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("sum =" + sum);
        return sum;
     }
     public static void main(String[] args) {
        int matrix [][] = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
           diogonalSum02(matrix);
       } 
}
