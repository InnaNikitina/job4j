package ru.job4j.loop;

public class Factorial {
    int sum = 1;

    public int calc(int n) {
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
