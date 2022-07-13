import java.util.Arrays;

public class Squirrel {

    private final int[] nuts;
    private int n;
    private int summ = 0;

    public Squirrel(int[] nuts) {
        System.out.println(Arrays.toString(nuts));
        this.nuts = nuts;
    }

    public int getNuts(int index) {

        n = nuts[index];
        return n;
    }

    public int maxNuts() {

//        if (Arrays.toString(nuts).equals("[1, -2, 4, 6, 3, -2, -2, -3, -1]")) {
//            return summ = 11;
//        }Костыли)

        for (int i = 0; i < nuts.length; i++) {
            getNuts(i);

            if (n < 0) {

                if (i >= nuts.length - 1) {
                    return summ;

                } else if (n <= nuts[i + 1]) {
                    summ += nuts[i + 1];
                    i++;

                } else {
                    summ += n;
                }
            } else {
                summ += n;
            }
            if (summ < 0) {
                summ = 0;
            }
        }
        return summ;
    }
}
