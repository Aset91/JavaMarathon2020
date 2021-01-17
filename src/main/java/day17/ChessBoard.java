package day17;

public class ChessBoard {
    ChessFigures[][] board = new ChessFigures[8][8];

    public ChessBoard(ChessFigures[][] board) {
        this.board = board;
    }

    public void print(){
        for (int i = 0; i < board.length; i++) {
            for (int j =0; j < board.length; j++) {
                System.out.print(board[i][j].getPic());
            }
            System.out.println();
        }

    }
}
