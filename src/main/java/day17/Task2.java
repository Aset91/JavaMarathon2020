package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard boardB = new ChessBoard(new ChessFigures[][]{
                {ChessFigures.ROOK_BLACK, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.ROOK_BLACK, ChessFigures.KING_BLACK, ChessFigures.EMPTY},
                {ChessFigures.EMPTY, ChessFigures.ROOK_WHITE, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.PAWN_BLACK, ChessFigures.PAWN_BLACK, ChessFigures.EMPTY, ChessFigures.PAWN_BLACK},
                {ChessFigures.PAWN_BLACK, ChessFigures.EMPTY, ChessFigures.KNIGHT_BLACK, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.PAWN_BLACK, ChessFigures.EMPTY},
                {ChessFigures.QUEEN_BLACK, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.BISHOP_WHITE, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY},
                {ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.BISHOP_BLACK, ChessFigures.PAWN_WHITE, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY},
                {ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.BISHOP_WHITE, ChessFigures.PAWN_WHITE, ChessFigures.EMPTY, ChessFigures.EMPTY},
                {ChessFigures.PAWN_WHITE, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.QUEEN_WHITE, ChessFigures.EMPTY, ChessFigures.PAWN_WHITE, ChessFigures.EMPTY, ChessFigures.PAWN_WHITE},
                {ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.EMPTY, ChessFigures.ROOK_WHITE, ChessFigures.KING_WHITE, ChessFigures.EMPTY}
        });
        boardB.print();

    }
}

