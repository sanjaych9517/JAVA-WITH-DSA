package Day_16_recursionBasic_part_01;

public class printSumOfNeturalNum {
    public static int calcSum(int n) {

        if (n == 1) {
            return 1;
        }
        int snm1 = calcSum(n - 1);
        int Sn = n + snm1;
        return Sn;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(calcSum(n));
    }
}
