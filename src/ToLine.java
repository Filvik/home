public class ToLine {

    private int[][] data;
    private int k = 0;


    public ToLine(int[][] data) {

        this.data = data;
    }

    public int[] resize() {
        int[] arr = new int[data.length*data[0].length];
        for (int i = 0 ; i < data.length && k < data.length*data[0].length; i++ ) {
            for (int j = 0; j < data[0].length && k < data.length*data[0].length; j++) {
                arr[k++] = data[i][j];
            }
        }return arr;
    }
}
