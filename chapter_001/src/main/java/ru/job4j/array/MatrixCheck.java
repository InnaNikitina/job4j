package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int m = data.length - 1;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[m][m] != data[m - i][m - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
