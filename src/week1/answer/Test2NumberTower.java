package week1.answer;

/**
 * 习题2 数塔问题
 *
 * Created by chelsea on 2017/5/31.
 */
public class Test2NumberTower {

    public static void main(String...args) {
        int[][] data = {{9, 0, 0, 0, 0}, {12, 15, 0, 0, 0}, {10, 6, 8, 0, 0}, {2, 18, 9, 5, 0},
                {19, 7, 10, 4, 16}};
        int[] result = getMaxPath(data);
        System.out.println("最大路径：");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "，");
        }
    }

    public static int[] getMaxPath(int[][] data) {
        int[][] temp = new int[data[0].length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                temp[i][j] = data[i][j];
            }
        }
        for (int i = data.length - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                temp[i][j] = temp[i][j] + Math.max(temp[i + 1][j], temp[i + 1][j + 1]);
            }
        }
        int[] result = new int[data.length];
        int lastIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                if (temp[i][lastIndex] > temp[i][lastIndex + 1]) {
                    result[i] = (data[i][lastIndex]);
                } else {
                    result[i] = (data[i][lastIndex + 1]);
                    lastIndex++;
                }
            } else {
                result[i] = data[0][0];
            }
        }
        return result;
    }

}
