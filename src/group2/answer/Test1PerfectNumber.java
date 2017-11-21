package group2.answer;

/**
 * 习题1 打印完数
 * Created by chelsea on 2017/5/31.
 */
public class Test1PerfectNumber {

    public static void main(String[] args) {
        printPerfectNumber(10000);
    }

    public static void printPerfectNumber(int range) {
        for (int i = 2; i <= range; i++) {
            int sum = 1;
            for (int low = 2, high = i - 1; low < high; low++) {
                if (i % low == 0) {
                    high = i / low;
                    sum += low;
                    if (low != high) {
                        sum += high;
                    }
                }
            }
            if (sum == i) {
                System.out.print(i + ",  ");
            }
        }
    }
}
