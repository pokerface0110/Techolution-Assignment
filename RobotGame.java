
public class RobotGame {

	public static void main(String[] args) {

		String sequence = "QQRQQRQRRQ";
		int gridSize = 5;
		int x = 3;
		int y = 3;
		char currDir = 'E';
		
		findPosition(sequence, x, y, currDir, gridSize);

	}

	public static void findPosition(String sequence, int x, int y, char currDir, int gridSize) {

		for (int i = 0; i < sequence.length(); i++) {
			switch (sequence.charAt(i)) {
			case 'P':
				switch (currDir) {
				case 'N':
					currDir = 'E';
					break;
				case 'S':
					currDir = 'W';
					break;
				case 'E':
					currDir = 'S';
					break;
				case 'W':
					currDir = 'N';
					break;
				}
				break;

			case 'R':
				switch (currDir) {
				case 'N':
					currDir = 'E';
					break;
				case 'E':
					currDir = 'S';
					break;
				case 'S':
					currDir = 'W';
					break;
				case 'W':
					currDir = 'N';
					break;
				}
				break;

			case 'Q':
				switch (currDir) {
				case 'N':
					y++;
					break;
				case 'E':
					x++;
					break;
				case 'S':
					y--;
					break;
				case 'W':
					x--;
					break;
				}
				break;
			}
		}
		if (x > gridSize || y > gridSize || x < 0 || y < 0)
			System.out.println("Please provide correct Sequence");
		else
			System.out.println( x + " " + y  + " " + currDir);
	}

}
