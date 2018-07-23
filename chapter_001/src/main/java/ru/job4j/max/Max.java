package ru.job4j.max;

/**
 * @author Inna Nikitina (mailto:janet-55@mail.ru)
 * @since 23.07.2018
 */

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }

}
