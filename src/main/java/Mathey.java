public class Mathey {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static float max(float a, float b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static int randomInteger(int a, int b) {
        if (a < b) {
            int num = (int) (Math.random() * (b - a) + a);
            return num;
        }
        return b;
    }
    public static int randomInteger(int a) {
        int num = (int) (Math.random() * (a - 0));
        return num;
    }
}