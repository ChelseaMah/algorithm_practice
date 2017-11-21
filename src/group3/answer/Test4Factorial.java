package group3.answer;

/**
 * 当n<=100 时，求n!的准确值
 * Created by chelsea on 2017/6/9.
 */
public class Test4Factorial {
    public static void main(String[] str) {
        System.out.println(factorialBelow100(99));
    }

    public static String factorialBelow100(int n) {
        if (n <= 0) {
            return "input error";
        } else if (n > 100) {
            return "input number is too large";
        }
//      Integer max:  21,4748,3647
//      数组每一位表示7位数
        int[] result = new int[]{
                 1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1,};

        for (int i = 2; i <= n; i++) {
            int d = 0;
            for (int j = 0; j < result.length; j++) {
                if (result[j] < 0 && d == 0) break;
                if (result[j] < 0) {
                    result[j] = d;
                } else {
                    result[j] = result[j] * i + d;
                }
                if (result[j] >= 10000000) {
                    d = result[j] / 10000000;
                    result[j] %= 10000000;
                } else {
                    d = 0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean isCap = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] >= 0) {
                if (isCap) {
                    sb.append(result[i]);
                    isCap = false;
                } else {
                    sb.append(10000000 + result[i]).deleteCharAt(sb.length() - 8);
                }
            }
        }
        return sb.toString();
    }
}
