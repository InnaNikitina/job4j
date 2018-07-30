package ru.job4j.loop;

/**
 * Класс создает шахматную доску в псевдографике.
 * @since 30.07.2018
 */

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int b = 0; b < width; b++) {
                if ((i + b) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
