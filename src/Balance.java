public class Balance {

    private static char a;
    private static int bowlWeight1;
    private static int bowlWeight2;

    public static void addRight(int n) {
        bowlWeight1 += n;
    }

    public static void addLeft(int n) {
        bowlWeight2 += n;
    }

    public static char getSituation() {
        if (bowlWeight1 == bowlWeight2) {
            a = '=';
        } else if (bowlWeight1 > bowlWeight2) {
            a = 'R';
        } else {
            a = 'L';
        }
        return a;
    }
}
