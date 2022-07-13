public class VK {
    public static void main(String[] args) {
        int value = add(3, 4);
        int result = added(value, 10);
        System.out.println(result);
    }

    public static int add(int x, int y) {
        int val = x + y;
        return val;
    }

    public static int added(int x, int y) {
        int res = x * y;
        return res;
    }
}