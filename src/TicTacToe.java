public class TicTacToe {

    private final String[][] game = new String[3][3];
    private final String player1 = "X";
    private final String player2 = "0";
    private String z;
    private String a = "X";

    public TicTacToe() {
        newGame();
    }

    public String makeMove(int x, int y) {
        System.out.println(a +": " + x + " " + y);

        if (!a.equals("z")) {
            if (game[x - 1][y - 1].equals(player1) || game[x - 1][y - 1].equals(player2)) {
                z = "Cell " + x + ", " + y + " is already occupied";
                return z;
            } else if (!game[x - 1][y - 1].equals(player1) || !game[x - 1][y - 1].equals(player2)) {

                game[x - 1][y - 1] = a;
                if (a.equals(player1)) {
                    a = player2;
                } else if (a.equals(player2)) {
                    a = player1;
                }
            }
            checkGame();

            if (z.equals("null")) {
                z = "Move completed";
            } else if (z.equals("D")) {
                a = "z";
                z = "Draw";
                return z;
            } else if (z.equals("X")) {
                a = "z";
                z = "Player X won";
                return z;
            } else if (z.equals("0")) {
                a = "z";
                z = "Player 0 won";
                return z;
            }
        } else {
            z = "Game was ended";
            return z;
        }
        return z;
    }


    public void newGame() {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = "-";
            }
        }
        a = player1;
        //System.out.println("New Game");
        printField();
    }


    public void printField() {
        System.out.println("[");
        for (int i = 0; i < game.length; i++) {
            System.out.print("\t[");
            for (int j = 0; j < game[0].length; j++) {
                System.out.print(game[i][j]);
                if (j < (game[0].length - 1)) System.out.print(", ");
                else {
                    if (i < game.length - 1) {
                        System.out.println("],");
                    } else {
                        System.out.println("]");
                    }
                }
            }
        }
        System.out.println("]");
    }


    public String[][] getField() {
        printField();
        return game;
    }


    public String checkGame() {

        if (stringCondition(player1)) {
            z = "X";
            return z;
        } else if (stringCondition(player2)) {
            z = "0";
            return z;
        } else if (checkingConditions(player1)) {
            z = "X";
            return z;
        } else if (checkingConditions(player2)) {
            z = "0";
            return z;
        } else if ((game[0][0].equals(player1) && game[1][1].equals(player1) && game[2][2].equals(player1)) || (game[0][2].equals(player1) && game[1][1].equals(player1) && game[2][0].equals(player1))) {
            z = "X";
            return z;
        } else if ((game[0][0].equals(player2) && game[1][1].equals(player2) && game[2][2].equals(player2)) || (game[0][2].equals(player2) && game[1][1].equals(player2) && game[2][0].equals(player2))) {
            z = "0";
            return z;
        } else {
            cellCheck();
        }
        return z;
    }


    public boolean stringCondition(String z) {

        boolean condition = false;

        for (int j = 0; j < game[0].length; j++) {
            for (int i = 0; i < game.length; i++) {

                if (z.equals(game[i][j])) {
                    condition = true;
                } else {
                    condition = false;
                    break;
                }
            }
            if (condition) {
                return condition;
            }
        }
        return condition;
    }


    public boolean checkingConditions(String z) {

        boolean condition = false;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {

                if (z.equals(game[i][j])) {
                    condition = true;
                } else {
                    condition = false;
                    break;
                }
            }
            if (condition) {
                return condition;
            }
        }
        return condition;
    }

    public String cellCheck() {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                if (game[i][j].equals("-")) {
                    z = "null";
                    return z;
                } else {
                    z = "D";
                }
            }
        }
        return z;
    }
}


