
import java.util.Scanner;

public class TestChessGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// TODO Auto-generated method stub
		GameSimulator NewGame = new GameSimulator();
		NewGame.Initialization();
		NewGame.DisplayBoardInConsole();
		
		while (!NewGame.DeathCheck()) {
			NewGame.DisplayBoardInConsole();

			if (NewGame.GetTurn() == 1) {
				//Player 1 Turn
				NewGame.Move(1, ChessOrgX, ChessOrgY, ChessDesX, ChessDesY);
			}
			else {
				//Player 2 Turn
				NewGame.Move(1, ChessOrgX, ChessOrgY, ChessDesX, ChessDesY);
			}
		}

	}

}
