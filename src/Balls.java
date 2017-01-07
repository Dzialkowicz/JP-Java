import javax.swing.*;

/**
 * Created by Kuba Sanecki on 06.01.2017.
 */
public class Balls extends JPanel {

	public Balls() {
		setLayout(null);
		// Set beginning points
		add(new Ball("red", 10 - (int) Math.round((Math.random() * 20)), 10 - (int) Math.round((Math.random() * 20))));

	}
}