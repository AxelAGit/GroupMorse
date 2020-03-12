public class TranslateMorse {

	static String[] EngArray = new String[] { "errorE", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "0", ".", ",", "?" };
	static String[] MorseArray = new String[] { "errorM", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
			".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
			".-.-.-", "--..--", "..--.." };

	public String engToMorse(String str) {

		int index = 0;
		for (int j = 0; j < EngArray.length; j++) {
			if (EngArray[j] == str) {
				index = j;
			}
		}
		return MorseArray[index];
	}

	public static String morseToEng(String morse) { //tar v�rde fr�n main class
	int index = 0;	
		String[]addSpace = morse.split("  "); //delar upp str�ngen till ord
		for (String singleWord:addSpace)
		{
			String[]morseCode = singleWord.split(" "); //delar upp orden till bokst�ver
			for (String morseLetter:morseCode) 
			{
				for (int morseCompare = 0; morseCompare < MorseArray.length; morseCompare++) //j�mf�r varje bokstav mot array v�rde
				{
					if (morseLetter.equals(MorseArray[morseCompare])) 
					{
						index = morseCompare;
						System.out.print(EngArray[morseCompare]); 
					}

				}   
			}
			System.out.print(" "); //L�gger till ett blanksteg mellan orden   
		}
		return  EngArray[index];
		//TODO test comment

		
	}

}


