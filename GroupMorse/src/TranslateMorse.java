public class TranslateMorse {

	static String[] EngArray = new String[] { "errorE", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "0", ".", ",", "?"," " };
	static String[] MorseArray = new String[] { "errorM", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
			".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
			".-.-.-", "--..--", "..--..","/" };

	public static String engToMorse(String letter) {
		String word="";
		for(int i=0; i < EngArray.length; i++) {
			if(letter.equals(EngArray[i])) {
				System.out.println(MorseArray[i]);
				word += MorseArray[i];
			}
		}
		if(word.isEmpty()) {
			word = "errorM";
		}
		return word;
	}

	public static String morseToEng(String morse) { //tar värde från main class
		String word="";
		String[]morseCode = morse.split(" "); //delar upp orden till bokstäver
		for (String morseLetter:morseCode)
		{
			for (int i = 0; i < MorseArray.length; i++) //jämför varje bokstav mot array värde
			{
				if (morseLetter.equals(MorseArray[i]))
				{
					System.out.print(EngArray[i]);
					word +=	EngArray[i];
				}
			}
			if(word.isEmpty()) {
				word = "errorE";
				System.out.print("invalid input");
			}
		}
		return  word;
		//TODO test comment


	}

}