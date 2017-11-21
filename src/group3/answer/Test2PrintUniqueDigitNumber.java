package group3.answer;

/**
 * 习题3
 * Created by chelsea on 2017/6/2.
 */
public class Test2PrintUniqueDigitNumber {

    public static void main(String[] str) {
        printUniqueDigitNumber();
    }

    public static void printUniqueDigitNumber() {
        for (int i = 10001; i < 32000; i++) {
            int[] digits = new int[10];
            int square = i * i;
            for (int j = 0; j < digits.length; j++) {
                int p = square % 10;
                if (digits[p] > 0) break;
                digits[p]++;
                square /= 10;
                if (square == 0) {
                    System.out.println("i = " + i + "    " + i * i);
                }
            }
        }
    }

}
