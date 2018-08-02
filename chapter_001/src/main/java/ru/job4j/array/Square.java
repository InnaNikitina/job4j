package ru.job4j.array;

/**
 * Метод заполняет массив элементами от 1 до bound, возведенными в квадрат.
 */


public class Square {

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 0; n < bound; n++) {
            rst[n] = (int) Math.pow((n + 1), 2);
        }
        return rst;
    }
}


