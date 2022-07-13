public class Schifrator {

    /**
     * Строка - алфавит
     */
    public static String ALFAVIT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int SHIFT = -26;

    public static final String TEST_PHRASE = "TesT PHRaSE!!!";


    public static void main(String[] args) {
        System.out.println("Исходная: " + TEST_PHRASE);

        System.out.println("Зашифрованная: " + encrypt(TEST_PHRASE));

        System.out.println("Расшифрованная: " + decrypt(encrypt(TEST_PHRASE)));
    }

    /**
     * Кодирвание строки
     *
     * @param text входная строка
     * @return закодированная строка
     */
    public static String encrypt(String text) {
        // TODO: 3
        //  вызываем метод encode, для сдвига влево смещение должно быть отрицательное
    return encode(text,-SHIFT);}

    /**
     * Декодирование строки
     *
     * @param text кодированная строка
     * @return раскодированная строка
     */
    public static String decrypt(String text) {
        //  вызываем метод encode, для сдвига вправо смещение не меняем
        // TODO: 4
        return encode(text,SHIFT);}

    /**
     * Кодирование строки путем посимвольного сдвига каждого символа исходной строки.
     *
     * @param text  исходная строка
     * @param shift смещение - Для смещения влево сдвиг должен быть отрицательный, вправо положительный
     * @return измененную строку
     */
    public static String encode(String text, int shift) {
        // TODO: 2

        // т.к. алфавит для шифрования в заглавном регистре, то исходную строку необходимо перевести в заглавный регистр
        //text = text.toUpperCase();
        // проверяем что смешение в диапазоне строки алфавита
        // если смещение большое то делаем его остатком от деления
        if (ALFAVIT.length() <= shift) {
            shift = shift % ALFAVIT.length();
        }
        // инициализируем строку с результатом (
        String result = "";
        // ЦИКЛ, счетчик i Посимвольно прохдим исходную строку
        for (int i = 0; i < text.length(); i++) {
        //к строке с результатом добавляем вызов ф-ции searchSymbol(аргументом передаем в нее символ с индексом i)
        //Конец цикла
        result += searchSymbol(text.charAt(i),shift);
        //возвращаем полученную строку
        }return result;
    }

    /**
     * Возвращает символ для замены
     *
     * @param symbol исходный символ
     * @param shift  смещение относительно алфавита
     * @return символ для замены
     */
    private static char searchSymbol(char symbol, int shift) {
        // TODO: 1

        // Ищем index входящего символа в алфавите (см. функции для строки)
        String symbolString = String.valueOf(symbol).toUpperCase();
        boolean isUpper = (String.valueOf(symbol).equals(symbolString));
        if (!isUpper) {
            symbol = String.valueOf(symbol).toUpperCase().charAt(0);
        }
        int index = ALFAVIT.indexOf(symbol);
        // если такой символ не был найден то возвращем символ без изменений (см. что вернет ф-ция если не найдет индекс в строке)
        if (index == -1) {
            return symbol;
        }
        // если index + смещение >= длины алфавита то index = index + смещение - длина алфавита
        if (index + shift >= ALFAVIT.length()) {
            index = index + shift - ALFAVIT.length();
        }
        // иначе если index + смещение < 0 то index = длина алфавита + index + смещение
        else if (index + shift < 0) {
            index = ALFAVIT.length() + (index + shift);
        }
        // иначе index = index + смещение
        else {
            index = index + shift;
        }

        // возвращаем символ с индексом (index) из строки с алфавитом
        return isUpper ? ALFAVIT.charAt(index) : String.valueOf(ALFAVIT.charAt(index)).toLowerCase().charAt(0);
    }
}