
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.*;

/**
 * Created by Kuba Sanecki on 06.11.2016.
 */
public class Main {
	public static void main(String[] args) {
		//function to call Packer
		//Packer.squaresInRectangle(102, 32);

		// args[0] must be equal to 24 characters
		//args[1] desired string
		System.out.println(args[0]);
		System.out.println(args[1]);

		Cipher cipher = new Cipher(args);


		String coded = cipher.codeLetters(args[1]);

		System.out.println("User message: " + args[1]);
		System.out.println("Coded message: " + coded);

		String decode = cipher.decodeLetters(coded);
		System.out.println("Decoded message" + decode);
		//System.out.println(Squares.letters[1][1]);  //Checking if squares work


	}
}
