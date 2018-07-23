package ru.job4j.max;

/**
 * @author Inna Nikitina (mailto:janet-55@mail.ru)
 * @since 23.07.2018
 */

public class Max {

    //Максимум из двух чисел.

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    //Максимум из трех чисел.

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }

}
