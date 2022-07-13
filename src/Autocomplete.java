import java.util.Arrays;

public class Autocomplete {

    public static void main(String[] args) {
        String [] label = new String [] {"audi", "toyota","volvo","volkswagen","vaz"};
        String tmp;
        int i,j;

        for (i=0; i<label.length; i++){
            System.out.print(label [i] + " ");
        }

        System.out.println();
        System.out.println("Отсортировано по длинне строки: ");


        for (i = label.length - 1; i > 0; i--){
            for (j=0; j < i; j++){
                if (label[j].trim().length() > label[j + 1].trim().length()){
                    tmp = label[j];
                    label[j] = label[j+1];
                    label[j + 1] = tmp;

                }
            }
        }

        System.out.println(Arrays.toString(label));
    }
}