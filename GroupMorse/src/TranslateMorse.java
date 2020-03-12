public class TranslateMorse {

	static String[] EngArray = new String[] { "errorE", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "0", ".", ",", "?"," " };
	static String[] MorseArray = new String[] { "errorM", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
			".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
			".-.-.-", "--..--", "..--..","/" };

	public static String engToMorse(String str) {

		int index = 0;
		for (int j = 0; j < EngArray.length; j++) {
			if (EngArray[j] == str) {
				index = j;
			}
		}
		return MorseArray[index];
	}

	public static String morseToEng(String morse) { //tar värde från main class
	    String word="";
			String[]morseCode = morse.split(" "); //delar upp orden till bokstäver
			for (String morseLetter:morseCode) 
			{
				for (int index = 0; index < MorseArray.length; index++) //jämför varje bokstav mot array värde
				{
					if (morseLetter.equals(MorseArray[index]))
					{
					System.out.print(EngArray[index]);
					word +=	EngArray[index];

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


