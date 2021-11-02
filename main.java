import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TicTacToe tactactoe = new TicTacToe();
		while(true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(tactactoe.play(x, y));
		}
	}
}