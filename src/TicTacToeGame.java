import java.util.Scanner;

public class TicTacToeGame {
	
	static Scanner sc = new Scanner(System.in);	
	
	// UC1 - Creating a Board
		public static char[] createBoard() {
			char[] board = new char[10];
			for (int pos = 1; pos < board.length; pos++) {
				board[pos] = ' ';
			}
			return board;
		}
		
		private static void startGame() {
			char[] board = createBoard();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to the TicTacToe Game");
			startGame();
			sc.close();
		}

}
