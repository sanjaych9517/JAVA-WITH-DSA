package Day_08;

public class solidRhombusPattern {
    public static void solidRhombusPattern(int n){
        for(int i = 0 ; i <= n ; i ++){
            for(int j = 0; j<=(n-i); j++){
                System.out.print("   ");
            }
            for(int j = 0; j <=n; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombusPattern(8);
    }
}
