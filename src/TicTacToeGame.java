import java.util.Scanner;

public class TicTacToeGame {
	
	static Scanner sc = new Scanner(System.in);	
	static char player, computer;
	static String lastPlayed;


	
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
				
				private static boolean isEmpty(char[] board) {
					for (char cell : board) {
						if (cell == ' ')
							return true;
					}
					return false;
				}
				
				//UC4 and UC5
				
				public static void movePlayer(char[] board) {
					System.out.print("Enter the index you want to move to: ");
					int index = sc.nextInt();
					while (index < 1 || index > 9) {
						System.out.print("Wrong Input. Try Again : ");
						index = sc.nextInt();
					}
					if (board[index] == ' ') {
						board[index] = player;
						displayBoard(board);
					} else {
						System.out.println("Index not available. Choose another");
						movePlayer(board);
					}
					lastPlayed = "Player";
					
					if (isEmpty(board)) {
//						moveComputer(board);
					} else {
						System.out.println("Game Tied. \nDo You Want to Play Another Game (Y/N) : "); // UC12 -- Board is full
						if (Character.toUpperCase(sc.next().charAt(0)) == 'Y') // UC13 -- Next Game
							startGame();
						else
							System.exit(0);
					}
					return;
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
