import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel implements ActionListener {

	double angle;
	Timer timer;

	Main() {
		super(null);
		timer = new Timer(100, this);
		timer.start();
	}

	public void actionPerformed(ActionEvent e) {
		angle += Math.random()/5;
		if (angle > (2 * Math.PI)) //angle > 2*PI
			angle = 0.0; //angle = 0
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.setColor(Color.red);
		int width = 300; //getWidth();
		int height = 300; //getHeight();
		int x = (int) (Math.cos(angle) * (width / 2) + (width / 2)); //     cos(angle) * width/3 + width/2
		int y = (int) (Math.sin(angle) * (height / 2) + (height / 2));//    sin(angle) * height/3 + height/2


		g.fillOval(x + 50, y + 50, 5, 5);
		g.drawOval(50, 50, 300, 300);

		g.fillOval(x + 150, y + 50, 5, 5);
		g.drawOval(150, 50, 300, 300);

		g.fillOval(x + 100, y + 150, 5, 5);
		g.drawOval(100, 150, 300, 300);

	}



	public static void main(String[] args) {
		JFrame frame = new JFrame("Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Main());
		frame.setSize(500, 500);
		frame.setVisible(true);


	}
}

