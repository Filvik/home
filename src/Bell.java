public class Bell {

    private static String ding = "ding";
    private static String dong = "dong";
    private static int i = 0;


    public static void sound() {

        if((i%2) <= 0) {
            System.out.println(ding);
        }
        else {
            System.out.println(dong);
        }
        i++;
    }
}
