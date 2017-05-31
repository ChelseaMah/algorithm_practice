package week1.answer;

/**
 * 习题1 找零钱
 * Created by chelsea on 2017/5/31.
 */
public class Test1ReturnChange {

    public static void main(String...args) {
        returnMoney(66, 101);
    }
    //MCX：
    public static void returnMoney(int price, int given) {
        int returnM = given - price;
        int[] values = {100, 50, 20, 10, 5, 2, 1};
        if (returnM < 0) {
            System.out.println("大哥，钱没给够");
        } else if (returnM == 0) {
            System.out.println("正好");
        } else {
            System.out.println("需找零 ：" + returnM + "元");
            for (int i = 0; i < values.length; i++) {
                int n = returnM / values[i];
                if (n > 0) {
                    System.out.println(values[i] + "元 ：" + n + "张");
                    returnM %= values[i];
                    if (returnM <= 0)
                        return;
                }
            }
        }
    }

    //XWW：
//    public static void main(String[] args) {
//
//        int price = 66;
//        int total = 67;
//        int charge = total - price;
//
//        int[] money = new int[]{50, 20, 10, 5, 2, 1};
//        int i = 0;
//        if (charge < 0)
//            System.out.println("滚犊子");
//        else if (charge == 0)
//            System.out.println("正好，可以滚犊子了");
//
//        while (charge > 0) {
//            charge -= charge(charge, money[i]);
//            i++;
//        }
//    }
//
//    public static int charge(int total, int count) {
//        int temp = total / count;
//        if (temp >= 1) {
//            System.out.println(count + " " + temp);
//            return temp * count;
//        }
//        return 0;
//    }
//

}
