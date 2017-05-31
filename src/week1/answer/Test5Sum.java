package week1.answer;

/**
 * 习题5，按公式求和
 * Created by chelsea on 2017/5/31.
 */
public class Test5Sum {
    public static void main(String...args) {
        System.out.println(1f - 1f / 6f + 1f / 120);
        System.out.println(getSum(3));
    }

    public static double getSum(int n) {
        double result = 0;
        int temp = 1;
        int tempIndex = -1;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            tempIndex = tempIndex + 2;
            if (tempIndex > 1) {
                temp = temp * (tempIndex - 1) * tempIndex;
            }
            result = result + sign * (1.0 / temp);
            sign = -sign;
        }
        return result;
    }
}
