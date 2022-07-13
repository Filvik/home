import java.util.Scanner;

public class Calculatorzvezda {

    private static final String EXIT = "s";
    private static final String CLEAR = "C";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String action = "C";
        //boolean test = true;
        int operand1 = 0;

        do {
            if (action.equals(CLEAR)) {
                System.out.println("Введите первое значение");
                operand1 = scanner.nextInt();
            }

            System.out.println("Введите арифметическое действие");
            char operandZnak = scanner.next().charAt(0);

            if (!(operandZnak == '+' || operandZnak == '-' || operandZnak == '*' || operandZnak == '/')) {
                System.out.println("Введен не правильный арифметический знак");
                continue;
            }

            System.out.println("Введите второе значение");
            int operand2 = scanner.nextInt();

            System.out.println("Ваш результат");
            operand1 = operation(operand1, operandZnak, operand2);
            System.out.println(operand1);

            System.out.println("Введите 'С' что бы сбросить текущий результат и начать программу заново/Введите 's' чтобы завершить программу/Введите любую клавишу для продолжения работы");

            action = scanner.next();
            //test = action.equals(CLEAR);
        }
        while (!(action.equals(EXIT)));
    }

    public static int operation(int operand1, char operandZnak, int operand2) {
        int result = 0;

        if (operandZnak == '+') {
            result = (operand1 + operand2);
        } else if (operandZnak == '-') {
            result = (operand1 - operand2);
        } else if (operandZnak == '*') {
            result = (operand1 * operand2);
        } else if (operandZnak == '/') {
            result = (operand1 / operand2);
        } else {
            System.out.println("Вы ввели недопустимый арифметический знак");
        }
        return result;
    }
}