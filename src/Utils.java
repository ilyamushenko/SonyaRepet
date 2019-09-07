public class Utils {
    private Utils() {}

    public static int sum (int... a) {
        int res = 0;
        for (int value : a) {
            res += value;
        }
        return res;
    }

}
