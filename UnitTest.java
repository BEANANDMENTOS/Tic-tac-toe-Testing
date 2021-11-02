import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UnitTest {
	@Test //black
	public void nextPlayerChangedFromX_to_O() {
		TicTacToe case1 = new TicTacToe();
		case1.play(1, 1);   //start X
		char step = case1.nextPlayer(); //to O
		assertEquals('O', step); //can't check O to X
	}
	
	@Test //white
	public void ifTheGameIsNOTOverSay_NoWinner() {
		TicTacToe case2 = new TicTacToe();
		assertEquals("No winner", case2.play(1, 1));
	}

	@Test //white
	public void WinTheCaseOnTheHorizontalRow() {
		TicTacToe case3 = new TicTacToe();
		case3.play(1, 1);
		case3.play(2, 1);
		case3.play(1, 2);
		case3.play(2, 2);
		assertEquals("X is the winner", case3.play(1, 3));
	}
	
	@Test //white
	public void WinTheCaseOnTheVerticalRow() {
		TicTacToe case4 = new TicTacToe();
		case4.play(1, 1);
		case4.play(1, 2);
		case4.play(2, 1);
		case4.play(2, 2);
		assertEquals("X is the winner", case4.play(3, 1));
	}
	
	@Test //white
	public void WinTheCaseOnTheMainDiagonal() {   //Left-Top to Right-Down
		TicTacToe case5 = new TicTacToe();
		case5.play(1, 1);
		case5.play(2, 1);
		case5.play(2, 2);
		case5.play(3, 1);
		assertEquals("X is the winner", case5.play(3, 3));
	}
	
	@Test //white
	public void WinTheCaseOnTheAntiDiagonal() {   //Right-Top to Left-Down
		TicTacToe case6 = new TicTacToe();
		case6.play(1, 3);
		case6.play(1, 1);
		case6.play(2, 2);
		case6.play(1, 2);
		assertEquals("X is the winner", case6.play(3, 1));
	}
	
	@Test //black
	public void O_PlayerIsWinner() {   //Right-Top to Left-Down
		TicTacToe case7 = new TicTacToe();
		case7.play(1, 1);
		case7.play(2, 2);
		case7.play(1, 2);
		case7.play(2, 1);
		case7.play(3, 1);
		assertEquals("O is the winner", case7.play(2, 3));
	}
	 
	@Test //black
	public void X_PlayerIsWinner() {
		TicTacToe case8 = new TicTacToe();
		case8.play(1, 1);
		case8.play(2, 2);
		case8.play(1, 2);
		case8.play(2, 1);
		assertEquals("X is the winner", case8.play(1, 3));
	}
	
	@Test //white
	public void case_SameToWin() {
		TicTacToe case9 = new TicTacToe();
		case9.play(2, 2);
		case9.play(3, 1);
		case9.play(1, 3);
		case9.play(3, 3);
		case9.play(2, 1);
		case9.play(2, 3);
		case9.play(3, 2);
		case9.play(1, 2);
		assertEquals("The result is draw", case9.play(1, 1));
	}
	
	@Test //black
	public void X_valueExceedsTheAvailableTablePosition() {
		TicTacToe case10 = new TicTacToe();
		try {
			case10.play(4, 1);
		} catch (RuntimeException ex) {
            assertEquals("X is outside board", ex.getMessage());
        }
	}
	
	@Test //black
	public void X_valueIsLessThanTheAvailableTablePosition() {
		TicTacToe case11 = new TicTacToe();
		try {
			case11.play(0, 1);
		} catch (RuntimeException ex) {
            assertEquals("X is outside board", ex.getMessage());
        }
	}
	
	@Test //black
	public void O_valueExceedsTheAvailableTablePosition() {
		TicTacToe case12 = new TicTacToe();
		try {
			case12.play(1, 1);
			case12.play(4, 1);
		} catch (RuntimeException ex) {
            assertEquals("O is outside board", ex.getMessage());
        }
	}
	
	@Test //black
	public void O_valueIsLessThanTheAvailableTablePosition() {
		TicTacToe case13 = new TicTacToe();
		try {
			case13.play(1, 1);
			case13.play(0, 1);
		} catch (RuntimeException ex) {
            assertEquals("O is outside board", ex.getMessage());
        }
	}
	
	@Test //white
	public void selectAnAlreadyUsedLocation() {
		TicTacToe case14 = new TicTacToe();
		try {
			case14.play(1, 1);
			case14.play(1, 1);
		} catch (RuntimeException ex) {
            assertEquals("Box is occupied", ex.getMessage());
        }
	}
}
