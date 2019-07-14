public class TicTacToeBoard {

    public static void main(String[] args) {
        new TicTacToeBoard();
    }

    private char[][]ticTacToeBoard = new char[3][3];
    private char player;

    public TicTacToeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToeBoard[i][j] = ' ';
            }
        }
        player = 'X';

        System.out.println("  1  2  3");
        System.out.println("A" + ticTacToeBoard[0][0] + " |" + ticTacToeBoard[0][1] + " |"
                + ticTacToeBoard[0][2]);
        System.out.println("-----------");
        System.out.println("B" + ticTacToeBoard[1][0] + " |" + ticTacToeBoard[1][1] + " |"
                + ticTacToeBoard[1][2]);
        System.out.println("-----------");
        System.out.println("C" + ticTacToeBoard[2][0] + " |" + ticTacToeBoard[2][1] + " |"
                + ticTacToeBoard[2][2]);
    }
}
