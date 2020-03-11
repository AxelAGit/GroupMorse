import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TranslateMorse Translate = new TranslateMorse();

		Translate.engToMorse("B");
		Translate.engToMorse("-..");

		String userInput;
		Scanner input = new Scanner(System.in);
		userInput = input.nextLine();

		for (int i = 0; i != userInput.length(); i++) { // ignorerar fel input
			char c = userInput.charAt(i);
			if (c != ' ' && c != '-' && c != '.') {
				break;
			}
		}
		TranslateMorse.morseToEng(userInput);
	}
}