package Day_08;

public class binaryPyramid {
    public static void bpyramid(int n){
        for (int i = 0; i <= n; i++) {
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        bpyramid(10);
    }
}
