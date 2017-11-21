package group2.answer;

/**
 * 习题3 打印如下规律三角形
 *  1
 *  5    2
 *  9    6    3
 *  11   10   8    4
 * Created by chelsea on 2017/6/2.
 */
public class Test3PrintTriangleTange {

    public static void main(String[] args) {
        printTriangleNumber(114);
    }

    public static void printTriangleNumber(int n) {
        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int r;
                if (i == j) {
                    r = i +1;
                } else {
                    int m = n - (i - j);
                    r = last[j] + m + 1;
                }
                last[j] = r;
                if (r < 1000) {
                    System.out.print(r + "\t\t");
                } else {
                    System.out.print(r + "\t");
                }
            }
            System.out.println();
        }

    }
}
