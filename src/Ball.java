import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuba Sanecki on 06.01.2017.
 */
public class Ball extends JPanel implements Runnable{
	Color color;
	int diameter;
	long delay;
	private int vx;
	private int vy;

	public Ball(String ballcolor, int xvelocity, int yvelocity) {

		if (ballcolor == "red") {
			color = Color.red;
		}

		diameter = 30;
		delay = 100;

		vx = xvelocity;
		vy = yvelocity;

		new Thread(this).start();

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		int x = getX();
		int y = getY();


		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillOval(0, 0, 30, 30); //adds color to circle
		g.setColor(Color.black);
		g2.drawOval(0, 0, 30, 30); //draws circle
	}

	@Override
	public void run() {

	}
}
