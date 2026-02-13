package Day_08;

public class invertedHalfPyramidWithNumber {
    public static void invertedHalfPyramidWithNumber(int n){
        
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <=(n-i); j++){
                System.out.print(j);
            }
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfPyramidWithNumber(5);
    }
}
