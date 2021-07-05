import java.util.Arrays;

public class ThirdLessonProj {
        public static void main(String[] args) {
            System.out.println();
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(array));
            replacingAnArray(array);
            System.out.println(Arrays.toString(array));


            System.out.println(Arrays.toString(arrayUpToOneHundred(100)));

            System.out.println();
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr));
            numbersMultipliedByTwo(arr);

            System.out.println();
            squareTwoDimensionalArray();

            int initialValue = 4;
            int size = 7;

            int[] fourthArray = methodWithTwoArguments(initialValue, size);
            System.out.println(Arrays.toString(fourthArray));


        }


        //    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
        public static void replacingAnArray(int[] inputArray) {

            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = (inputArray[i] == 1) ? 0 : 1;
            }
        }



        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        static int[] arrayUpToOneHundred(int length) {
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = (i + 1);
            }

            return arr;
        }



//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//    public static void numbersMultipliedByTwo(int[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
//        }
//    }

        public static void numbersMultipliedByTwo(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 6) {
                    arr[i] = arr[i] * 2;
                }
                System.out.print(arr[i] + " ");
            }
        }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

        public static void squareTwoDimensionalArray() {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

//    5. Написать метод, принимающий на вход два аргумента:
//    len и initialValue, и возвращающий одномерный массив типа int длиной len,
//    каждая ячейка которого равна initialValue;

        public static int[] methodWithTwoArguments(int initialValue, int length)
        {
            int[] result = new int[length];
            for (int i = 0; i < result.length; i++)
            {
                result[i] = initialValue;
            }
            return result;
        }
}
