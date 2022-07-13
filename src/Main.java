public class Main {

    public static void main(String[] args) {

        SeaBoard board = new SeaBoard();
//        board.shoot(0, 0, "m");
//        board.shoot(2, 0, "h");
//        board.shoot(6, 9, "h");
        board.shoot(6, 8, "h");
        board.shoot(6, 7, "h");
        board.shoot(6, 6, "d");
//        board.shoot(2, 1, "d");
//        board.shoot(7, 3, "d");
        board.getField();
    }
}