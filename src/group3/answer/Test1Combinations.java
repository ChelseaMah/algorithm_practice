package group3.answer;

/**
 * 习题1 打印出n个自然数（1，2，3，…，n）中取r个数的组合
 * Created by chelsea on 2017/6/2.
 */
public class Test1Combinations {

    public static void main(String... arg) {
        printCombinations(5, 3);
    }

    public static void printCombinations(int n, int r) {
        if (n < r || n <= 0 || r <= 0) {
            System.out.println("Input Error");
        } else {
            printCombinations(1, n, r, "");
        }
    }

    public static void printCombinations(int start, int end, int r, String str) {
        if (end - start < 0 || r <= 0) {
            System.out.println(str);
            return;
        }
        if (end - start + 1 == r) {
            System.out.print(str);
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
            System.out.println();
        } else {
            printCombinations(start + 1, end, r - 1, str + start + ",");
            printCombinations(start + 1, end, r, str);
        }
    }
}
