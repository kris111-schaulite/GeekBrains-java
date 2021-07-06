import java.util.Random;
import java.util.Scanner;

public class FourthLessonProj {
    public static int SIZE = 4;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        int prevTrueCount = 0;

        // check horizontal win
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    prevTrueCount = prevTrueCount + 1;
                } else {
                    prevTrueCount = 0;
                }

                if (prevTrueCount == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        // check vertical win
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == symb) {
                    prevTrueCount = prevTrueCount + 1;
                } else {
                    prevTrueCount = 0;
                }

                if (prevTrueCount == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        // check diagonals win
        for (int i = 0; i < (SIZE * 2 - 1); i++) {
            prevTrueCount = 0;

            for (int j = 0, k = i; k >= 0; j++, k--) {
                if (k < SIZE && j < SIZE) {
                    if (map[j][k] == symb) {
                        prevTrueCount = prevTrueCount + 1;
                    } else {
                        prevTrueCount = 0;
                    }

                    if (prevTrueCount == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < (SIZE * 2 - 1); i++) {
            prevTrueCount = 0;

            for (int j = SIZE - i - 1, k = 0; k <= SIZE; j++, k++) {
                if (j < SIZE && j >= 0 && k < SIZE) {
                    if (map[j][k] == symb) {
                        prevTrueCount = prevTrueCount + 1;
                    } else {
                        prevTrueCount = 0;
                    }

                    if (prevTrueCount == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellInValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellInValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellInValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return true;
        }

        return map[y][x] != DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
