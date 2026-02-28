package Day_12_2DArrays;

public class question_01 {
    // print the number of 7's that are in the 2D array
    // input - int [][] array = {{4,7,8},
    //                            {8,8,7}};
    //                     output -02;       
    public static int question_01(int matrix [][], int key){
       int  count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for(int j =0; j < matrix[0].length; j++){
                 if(matrix[i][j] == key){
                    count+=1;
                 }
            }
        }
        System.out.println("no. of " + key + "=" + count);
        return count;
    }
    
    // execute main function
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,7,14,15},
                             {16,17,18,19,20},
                            {21,22,23,7,25}};
                            question_01(matrix, 7);
    }
}
