import java.util.Scanner;

public class TicTacToeGame {
	
	static Scanner sc = new Scanner(System.in);	
	static char player, computer;

	
	// UC1 - Creating a Board
		public static char[] createBoard() {
			char[] board = new char[10];
			for (int pos = 1; pos < board.length; pos++) {
				board[pos] = ' ';
			}
			return board;
		}
		
		// UC2 - Taking Input
		public static char takeInput() {
			System.out.println("Enter the letter you wish to take: ('X' / 'O'): ");
			char input = Character.toUpperCase(sc.next().charAt(0));
			if (input == 'X' || input == 'O') {
				setLetter(input);
				return input;
			} else {
				System.out.println("Invalid Character. Try Again.");
				return takeInput();
			}
		}

		// UC2 - Determine letter for player and computer
		public static void setLetter(char player) {
			computer = (player == 'X') ? 'O' : 'X';
			System.out.println("Player Letter: " + player + "\nComputer Letter : " + computer);
		}
		
		// UC3 - Display the Board
				public static void displayBoard(char[] board) {
					System.out.println("\n\t " + board[1] + " | " + board[2] + " | " + board[3] + "\n\t-----------");
					System.out.println("\t " + board[4] + " | " + board[5] + " | " + board[6] + "\n\t-----------");
					System.out.println("\t " + board[7] + " | " + board[8] + " | " + board[9] + "\n\t");
				}
		
		private static void startGame() {
			char[] board = createBoard();
			takeInput();
			displayBoard(board);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to the TicTacToe Game");
			startGame();
			sc.close();
		}
		
		

}
