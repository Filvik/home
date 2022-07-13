import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое значение");
        int operand1 = scanner.nextInt();

        System.out.println("Введите арифметическое действие");
        char operandZnak = scanner.next().charAt(0);

        System.out.println("Введите второе значение");
        int operand2 = scanner.nextInt();

        System.out.println("Ваш результат " + operation(operand1, operandZnak, operand2));
        ;
    }

    public static int operation(int operand1, char operandZnak, int operand2) {
        return switch (operandZnak) {
            case '+'-> operand1 + operand2;

            case '-'->operand1 - operand2;

            case '*'->operand1 * operand2;

            case '/'-> operand1 / operand2;

            default-> {
                yield 0;
            }
        };
    }
}
