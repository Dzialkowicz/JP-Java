import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kuba Sanecki on 13.11.2016.
 */
public class Packer {

	static double radius = 0;
	static double pi = Math.PI;
	static int NOCirclesInRectangle = 0;
	//static Double [] circleParameters;

	private static ArrayList<Double> circleParameters = new ArrayList<Double>();

	// width, height
	public static void squaresInRectangle(int width, int height) {

		if (width <= height) {
			radius = width / 2;
		} else radius = height / 2;

		int areaOfRectangle = width * height;
		double areaOfCircle = pi * radius * radius;

		// for (int i =0; i<max ; i++)
		for (radius = width / 2; radius > 2; radius = radius - radius / 10) {
			areaOfCircle = pi * radius * radius;
			//minimal radius value, end calculations
			if (areaOfCircle < areaOfRectangle) {

				for (int i = 0; i <= NOCirclesInRectangle; i++) {
					circleParameters.add(radius);
					NOCirclesInRectangle++;
					break;

				}
			}
		}
		System.out.println("Number of Circles in Rectangle: " + NOCirclesInRectangle);
		System.out.println("Radius's: ");
		System.out.println(circleParameters);

	}
}
