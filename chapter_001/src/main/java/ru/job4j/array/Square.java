package ru.job4j.array;

/**
 * Метод заполняет массив элементами от 1 до bound, возведенными в квадрат.
 */


public class Square {
    int i = 1;

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 0; n < bound; n++) {
            rst[n] = (int) Math.pow(i, 2);
            i++;
            if (i > bound) {
                break;
            }
        }

        return rst;
    }
}


