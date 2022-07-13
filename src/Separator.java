import java.util.
        Arrays;

public class Separator {

    private int[] array;

    public Separator(int[] array) {

        this.array = array;
        System.out.println(Arrays.toString(array));
    }

    public int[] odd() {

        int[] oddArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[i] = array[i];
            }
        }
        return rep(oddArray);
    }

    public int[] even() {

        int[] evenArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if ((array[i] != 0)) {
                if ((array[i] % 2) == 0) {
                    evenArray[i] = array[i];
                }
            }
        }
        return rep(evenArray);
    }

    public int[] rep(int[] mass) {

        String a = Arrays.toString(mass);
        String n =  a
                .replace(", 0", "")
                .replace("[" , "")
                .replace("]" , "")
                .replace(" ", "");

        if (n.charAt(0) == '0') {
            n = n.substring(2);
        }
        String[] b = n.split(",");
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);
        }return c;
    }
}

