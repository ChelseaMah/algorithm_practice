package group2.answer;

/**
 * 习题2 打印鞍点
 * Created by chelsea on 2017/6/2.
 */
public class Test2SaddlePoint {

    public static void main(String[] args) {
        int[][] data = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 6, 6, 8, 9, 10 },
                { 4, 6, 5, 3, 1 },
                { 5, 6, 77, 3, 2 }, };
        getSaddlePoint(data);
    }
    //无重复最小最大值的算法
//    public static void getSaddlePoint(int[][] data) {
//        for (int i = 0; i < data.length; i++) {
//            int minIndex = getMinIndex(data[i]);
//            if (isMaxInVertical(data, data[i][minIndex], minIndex)) {
//                System.out.println("x=" + minIndex + ", y=" + i + "  是鞍点");
//            }
//        }
//    }

    public static void getSaddlePoint(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (isMinData(data[i], j) && isMaxInVertical(data, data[i][j], j)) {
                    System.out.println("x=" + j + ", y=" + i + "  是鞍点");
                }
            }
        }
    }

    private static boolean isMinData(int[] data, int index) {
        for (int i = 0; i < data.length; i++) {
            if (index != i && data[index] > data[i])
                return false;
        }
        return true;
    }


    private static boolean isMaxInVertical(int[][] data, int n, int index) {
        for (int i = 0; i < data.length; i++) {
            if (i != index && data[i][index] > n)
                return false;
        }
        return true;
    }

    public static int getMinIndex(int[] data) {
        if (data == null || data.length == 0)
            return -1;
        int min = data[0];
        int minIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                minIndex = i;
                min = data[i];
            }
        }
        return minIndex;
    }
}
