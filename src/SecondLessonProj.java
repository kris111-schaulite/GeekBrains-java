public class SecondLessonProj {
    public static void main(String[] args) {
        System.out.println(compareSumNumbers(1, 2));
        System.out.println(compareSumNumbers(6, 12));
        System.out.println(compareSumNumbers(20, 12));

        checkPositive(-4);
        checkPositive(0);
        checkPositive(9);

        System.out.println(isNegative(9));
        System.out.println(isNegative(0));
        System.out.println(isNegative(-7));

        printMessage(6, "Hello World!");
    }
    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    public static boolean compareSumNumbers(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);
    }
//2. Написать метод,
// которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    public static void checkPositive(int a) {
        boolean result = a >= 0;

        if (result) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

//    3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isNegative(int i) {
        return i < 0;
    }

    //     4. Написать метод, которому в качестве аргументов передается строка и число,
//     метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printMessage (int count, String message) {
        for (int i = 1; i < count; i++) {
            System.out.println(message);
        }

    }
}
