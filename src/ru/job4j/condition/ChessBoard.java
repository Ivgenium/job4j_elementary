package ru.job4j.condition;

import static ru.job4j.condition.Point.*;
import static ru.job4j.condition.Triangle.*;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 < 0 || x1 > 7 || x2 < 0 || x2 > 7 || y1 < 0 || y1 > 7 || y2 < 0 || y2 > 7) {
            return rsl;
        }
        double x1y1x2y2 = distance(x1, y1, x2, y2);
        double x1x2 = distance(x1, 0, x2, 0);
        double y1y2 = distance(0, y1, 0, y2);
        if (exist(x1y1x2y2, x1x2, y1y2) && x1x2 == y1y2) {
            rsl = Math.abs(y2 - y1);
        }
        return rsl;
    }
}
