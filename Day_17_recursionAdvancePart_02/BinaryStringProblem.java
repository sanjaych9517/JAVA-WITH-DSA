package Day_17_recursionAdvancePart_02;

public class BinaryStringProblem {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Place 0
        printBinStrings(n - 1, 0, str + "0");

        // Place 1 only if previous digit was 0
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}