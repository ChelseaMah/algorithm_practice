package group4.answer;

/**
 * Test1趣味矩阵
 * Created by chelsea on 2017/6/9.
 */
public class Test1FunMatrix {
    public static void main(String...str) {
        printFunMatrix(8);
    }

    private static void printFunMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i==j || i == n - j - 1) {
                    System.out.print(0 + "   ");
                } else if (i < j && i < n - j -1) {
                    System.out.print("1"+ "   ");
                } else if (i < j && i > n - j -1) {
                    System.out.print("4"+ "   ");
                } else if (i > j && i < n - j -1) {
                    System.out.print("2"+ "   ");
                } else if (i > j && i > n - j -1) {
                    System.out.print("3"+ "   ");
                }
            }
            System.out.println();
        }
    }
}
