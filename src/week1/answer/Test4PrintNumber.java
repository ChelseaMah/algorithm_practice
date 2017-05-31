package week1.answer;

/**
 * Created by chelsea on 2017/5/31.
 */
public class Test4PrintNumber {
    public static void main(String...args) {
        printNumber(12345);
    }

    public static void printNumber(int n) {
        if (n < 0) {
            System.out.println("input error");
            return;
        }
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printNumber(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
