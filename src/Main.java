import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TextCounter counter = new TextCounter();

		System.out.println("Enter some text ('stop' to finish):");

		while (true) {

			String text = scanner.nextLine();
			if (text.equals("stop")) {
				break;
			}

			counter.addText(text);
		}

		System.out.println("Number of lines: " + counter.getLines());
		System.out.println("Number of characters: " + counter.getCharacters());

		scanner.close();

	}
}
