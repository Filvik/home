
public class SeaBoard {

    private final String[][] field = new String[10][10];

    public SeaBoard() {
        newGame();
    }

    public void newGame() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = ".";
            }
        }
        System.out.println("New Game");
    }

    public void printField() {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j]);
                if (j < (field[0].length - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
            }
        }
    }

    public String[][] getField() {
        printField();
        return field;
    }

    public void shoot(int line, int column, String issue) {
        System.out.println(line + " " + column+ " " + issue);

        switch (issue) {

            case "m":
                field[line][column] = "#";
                break;
            case "h":
                field[line][column] = "x";
                break;
            case "d":
                field[line][column] = "x";

                int levo = column;
                int pravo = column;
                int verh = line;
                int niz = line;

                int i = line;
                int j = column;
                while (j > 0 && field[i][--j].equals("x"));
                levo = j;

                i = line;
                j = column;
                while (j < 9 && field[i][++j].equals("x"));
                    pravo = j;

                    i = line;
                    j = column;
                    while (i > 0 && field[--i][j].equals("x"));
                        verh = i;


                    i = line;
                    j = column;
                    while (i < 9 && field[++i][j].equals("x"));
                        niz = i;


                    for (i = verh; i <= niz; i++) {
                        for (j = levo; j <= pravo; j++) {
                            if (field[i][j].equals(".")) {
                                field[i][j] = "#";
                            }
                        }
                    }
                    break;
                }
        }

        public String check ( int line, int column){

        if (field[line][column].equals(".")) {
            field[line][column] = ".";
        }
        else if (field[line][column].equals("#")) {
            field[line][column] = "#";
        }
        else if (field[line][column].equals("x")) {
            field[line][column] = "x";
        }
        return field[line][column];
        }
    }
