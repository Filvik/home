public class ToTable {

        private int[] data;
        private int x;
        private int y;
        private int k = 0;

    public ToTable( int[] data, int x, int y){

            this.data = data;
            this.x = x;
            this.y = y;
        }

        public int[][] resize () {
            int [][] arr = new int[x][y];
            for (int i = 0; i < x && k < data.length; i++) {
                for (int j = 0; j < y && k < data.length; j++) {
                    arr[i][j] = data[k++];
                }
            }
            return arr;
        }
}
