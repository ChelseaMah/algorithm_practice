package week4.answer;

/**
 * Test2螺旋矩阵
 * Created by chelsea on 2017/6/9.
 */
public class Test2SpiralMatrix {
    public static void main(String... str) {
        int[][] spiralMatrix = getSpiralMatrix(8);
        for (int data[] : spiralMatrix) {
            for (int i : data) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] getSpiralMatrix(int n) {
        if (n > 0) {
            int[][] result = new int[n][n];
            int start = 0, end = n - 1;
            int num = 1;
            while (end >= start) {
                for(int i = start; i <= end; i ++) {
                    result[i][start] = num++;
                }
                for(int i = start + 1; i <= end; i++) {
                    result[end][i] = num++;
                }
                for(int i = end - 1; i >= start; i--) {
                    result[i][end] = num ++;
                }
                for (int i = end -1; i >= start + 1; i--) {
                    result[start][i] = num++;
                }
                start++;
                end--;
            }
            return result;
        } else {
            return new int[0][0];
        }
    }
}
