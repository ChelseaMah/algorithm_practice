package group5;

/**
 * 关灯问题
 */
public class OnOffLamp {

    public static void main(String... str) {
        onOffLamp(20);
    }

    private static void onOffLamp(int n) {
        if (n <= 0) {
            System.out.println("input error");
        }
        System.out.println("还亮着的灯有:");
        boolean[] lamps = new boolean[n];
        for (int i = 2; i < n; i++) {
            for (int j = i - 1; j < n; j += i) {
                lamps[j] = !lamps[j];
                if (lamps[j] && j < i) {
                    System.out.print("第" + (j + 1) + "栈   ");
                }
            }
        }
    }
}
