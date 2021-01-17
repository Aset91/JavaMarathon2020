package day17;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<ChessFigures> figures = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            figures.add(ChessFigures.PAWN_WHITE);
        }
        for (int i = 0; i < 4; i++) {
            figures.add(ChessFigures.ROOK_BLACK);
        }
        for (ChessFigures c : figures) {
            System.out.print(c.getPic() + " ");
        }
    }
}
