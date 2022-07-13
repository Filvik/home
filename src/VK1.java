public class VK1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        checkTriangleNeNull(a, b, c);
    }

    public static void checkTriangleNeNull(int a, int b, int c) {
        if (a < 1 || b < 1 || c < 1) {
            System.out.println("No/Треугольник не существует,так как одна или несколько сторон равны 0");
            return;
        }
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Yes/Треугольник существует");
        }
        else {
            System.out.println("No/Треугольник не существует");
        }
    }
}