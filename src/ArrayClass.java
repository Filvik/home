public class ArrayClass {

    public static void printArr(){
        int [] data= {1,2,3,4,5,6,7,8,9};
        int x = 5;
        int [][] arr = new int[x][x];

        for (int i = 0; i < data.length; i++){
            System.out.println("[" + i/x + "][" + i%x + "]");
            arr[i/x][i%x] = data[i];
        }

        for (int i = 0; i <x; i++){
            for (int j = 0;j <x; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
