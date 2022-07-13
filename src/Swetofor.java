public class Swetofor {

    public static void main(String args[]) {
        String swetColor = "Красный";
        swet(swetColor);
    }

    public static String swet(String swetColor) {
        return switch (swetColor) {
            case "Красный" -> "Остановись";
            case "Желтый" -> "Подожди";
            case "Зеленый" -> "Езжай";
            default -> "Error";
        };
    }
}