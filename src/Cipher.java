/**
 * Created by Kuba Sanecki on 06.11.2016.
 */
public class Cipher {

	//declaring place where to store new pattern
	private static char[][] cipherPattern;
	private static String decoded = "";
	private static String coded = "";

	Cipher(String args[]) {
		cipherPattern = new char[5][5];
		setCodeKey(args[0]);
	}


	private void setCodeKey(String key) {
		int letter = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				//fill cipherPattern with chars from String key

				if (key != null && key.length() > 0 && letter < key.length()) {
					cipherPattern[i][j] = key.charAt(letter);
					letter++;
				}
				System.out.println("Empty String!");
			}
		}
	}


	public static String codeLetters(String toCode) {
		for (int c = 0; c < toCode.length(); c++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (toCode.charAt(c) == cipherPattern[i][j]) {
						coded = coded + i;
						coded = coded + j;
					}
				}
			}
		}


		return coded;
	}

	public static String decodeLetters(String coded) {

		for (int i = 0; i < coded.length(); i++) {
			decoded = decoded + cipherPattern[Character.getNumericValue(coded.charAt(i))]
					[Character.getNumericValue(coded.charAt(i + 1))];
		}

		return decoded;
	}


}
