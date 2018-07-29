package ru.job4j.loop;

public class Counter {
    int sum;

    /**
     * Метод вычисляет сумму четных чисел в диапозоне от start до finish.
     */
    public int add(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}

