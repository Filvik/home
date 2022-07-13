public class Solution {
    public static void main(String[] args) {
        int number = 88;
        System.out.println(checkDay(number));
    }

    public static String checkDay(int number) {
        return switch (number) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресения";
            default -> "Error";
        };
    }
}
