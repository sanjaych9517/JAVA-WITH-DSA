package Day_17_recursionAdvancePart_02;

public class TilingProblem_11 {
    public static int tileProblem(int n) {
        // base case
        if (n == 1 || n == 0)   return 1;
    
        // vertical choice
        int fnm1 = tileProblem(n - 1);
        // Horizotal Chooise
        int fnm2 = tileProblem(n - 2);
        // total way
        int tWay = fnm1 + fnm2;
        return tWay;

        // or short hand
        // return tileProblem(n - 1) + tileProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(tileProblem(4));
    }
}
