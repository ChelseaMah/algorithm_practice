package group3.answer;

/**
 * 高精度数据 * 长整数.
 * Created by chelsea on 2017/6/9.
 */
public class Test3GreatNumberMutiply {

    public static void main(String[] str) {
        System.out.println(greatNumberMultiply("92233720368547758.07", 9223372036854775807L));
    }

    public static String greatNumberMultiply(String greatNum, long n) {
        int index = greatNum.indexOf(".");
        int decimalDigit = -1;
        if (index > 0) {
            decimalDigit = greatNum.length() - 1 - index;
        }
        char[] chars = greatNum.replace(".", "").toCharArray();
        long d = 0L;
        long c;
        StringBuilder result = new StringBuilder();
        // long max value:
        //        9223372036854775807
        long max = 100000000000000000L;
        if (n > max) {
            long high = n / max;
            long low = n % max;
            for (int i = chars.length - 1; i >= 0; i--) {
                c = (chars[i] - '0');
                low = (low) * c + d;
                high = high * (c) + low / max;
                d = high * max / 10 + low / 10;
                high %= 10;
                low %= 10;
                result.insert(0, low);
                result.insert(0, high);
            }
        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                c = (chars[i] - '0');// * n + d;
                c = c * n + d;
                d = c / 10L;
                result.insert(0, c % 10L);
            }
        }
        if (d > 0) {
            result.insert(0, d);
        }
        if (decimalDigit > -1) {
            result.insert(result.length() - decimalDigit, ".");
        }
        return result.toString();
    }

}
