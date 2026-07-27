package Day_16_recursionBasic_part_01;

public class print1ToN_insOrder {
    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n = 100;
        printInc(n);
    }
}
