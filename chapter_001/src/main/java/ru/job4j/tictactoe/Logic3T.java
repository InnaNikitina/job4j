package ru.job4j.tictactoe;

import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }


    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        for (int startX = 0; startX < this.table.length; startX++) {
            if (this.fillBy(Figure3T::hasMarkX, 0, 0, 0, 1)) {
                result = true;
            }
        }
        for (int startY = 0; startY < this.table.length; startY++) {
            if (this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 0)) {
                result = true;
            } else if (this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 1)
                    || this.fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1)) {
                result = true;
            }
        }
        return result;
    }

    public boolean isWinnerO () {
        boolean result = false;

            for (int startX = 0; startX < this.table.length; startX++) {
                if (this.fillBy(Figure3T::hasMarkO, 0, 0, 0, 1)) {
                    result = true;
                }
            }
            for (int startY = 0; startY < this.table.length; startY++) {
                if (this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 0)) {
                    result = true;

                } else if (this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 1)
                        || this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1)) {
                    result = true;
                }
            }
            return result;
        }

        public boolean hasGap() {
            boolean gap = false;
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                    if (!(table[j][i].hasMarkX() || table[i][j].hasMarkO())) {
                        gap = true;
                        break;
                    }
                }
                if (gap) {
                    break;
                }

            }
            return gap;
        }
    }







