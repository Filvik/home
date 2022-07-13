public class Solution1 {
    public static void main(String[] args) {
        float a = 1.5f;
        int b = 2;
        int c = 3;
        System.out.println(checkParamNotNull(a, b, c) ?
                checkTriangleNeNull(a, b, c) ? "Треугольник существует" : "Треугольник не существует" :
                "Треугольник не существует,так как одна или несколько сторон равны 0");
    }

    public static boolean checkTriangleNeNull(float a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    private static boolean checkParamNotNull(float a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }
}