import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        JFrame mainMenu = new JFrame("Menu");
        mainMenu.setVisible(true);
        mainMenu.setSize(300,200);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        JPanel panel = new JPanel();
        mainMenu.add(panel);

        JButton button1 = new JButton("Zloz zamowienie");
       // button1.setSize(null);
        panel.add(button1);
        button1.addActionListener (new Action1());

        JButton button2 = new JButton("Realizuj zamowienie    ");
        panel.add(button2);
        button2.addActionListener (new Action2());

        JButton button3 = new JButton("Zarzadzaj Magazynem");
        panel.add(button3);
        button3.addActionListener (new Action3());

        JButton button4 = new JButton("Zarzadzaj Personelem");
        panel.add(button4);
        button4.addActionListener (new Action4());

    }

    static class Action1 implements ActionListener {
	    public static ComboBoxModel<Array> flowerList;
	    public static String numberOfFlowers;
	    public static String userName;
	    public static String userSurname;
	    public static String userAddress;

	    public void actionPerformed(ActionEvent e) {

		    //Refresh flower list
		    //Defining frame
		    JFrame frame1 = new JFrame("Zamowienie");
		    frame1.setVisible(true);
		    frame1.setSize(500, 400);


		    //Defining panel
		    JPanel panel1 = new JPanel();
		    panel1.setLayout(new GridLayout(20,10));

			//Defining input for flower type
		    JLabel comboBoxdescription = new JLabel("Wybierz kwiat: ");
		    JComboBox flowerList = new JComboBox(ManageOrders.namesOfFlowers);
		    flowerList.setVisible(true);
		    flowerList.setMaximumSize(new Dimension(100,20));

			//Defining input for numberOFflowers
		    JLabel numberOfFlowersDescription = new JLabel("Wybierz ilosc: ");
		    JTextField numberOfFlowers = new JTextField(3);

			//Defining input for user
		    JLabel userInputDescription = new JLabel("Podaj imie i nazwisko: ");
		    JTextField userName = new JTextField(10);
		    JTextField userSurname = new JTextField(30);

			//Defining input for Address
		    JLabel userAddressDescription = new JLabel("Podaj adres: ");
		    JTextField userAdress = new JTextField(10);

		    JButton proceedOrder = new JButton("Zloz zamowienie! ");

			//Adding panel to frame
		    frame1.add(panel1);

		    //Adding flower type to panel
		    panel1.add(comboBoxdescription);
		    panel1.add(flowerList);

		    //Adding number of flowers to panel
		    panel1.add(numberOfFlowersDescription);
		    panel1.add(numberOfFlowers);

		    //Adding user name and surname to panel
		    panel1.add(userInputDescription);
		    panel1.add(userName);
		    panel1.add(userSurname);

			//Adding address to panel
		    panel1.add(userAddressDescription);
		    panel1.add(userAdress);

		    panel1.add(proceedOrder);
		    proceedOrder.addActionListener (new flowersOrdered());
		    //TEST


		    //System.out.println(numberOfFlowers, userAdress, userName, userSurname);

		    //Adding Button to proceed order



	    }
    }
	static class flowersOrdered implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Order.listOfOrders.add(Order.objectOrder);
			System.out.println(Order.listOfOrders);
		}
	}

	static class Action2 implements ActionListener {
		public static JList orderList;
		public static JButton realizeButton;
		public static JScrollPane listScrollPane;

		public void actionPerformed (ActionEvent e) {
		    JFrame frame2 = new JFrame("Realizuj zamowienie");
		    frame2.setVisible(true);
		    frame2.setSize(300,200);
		    JPanel panel2 = new JPanel();


			orderList = new JList();
			orderList.setVisible(true);
			orderList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		    orderList.setSelectedIndex(0);
		    orderList.setVisibleRowCount(5);
		    listScrollPane = new JScrollPane(orderList);

		    realizeButton = new JButton("Realizuj");
		    realizeButton.setActionCommand("Realizuj");
		    realizeButton.addActionListener(new RealizeListener());


		    frame2.add(panel2);
			panel2.add(orderList);
			panel2.add(realizeButton);
	    }
    }
	static class RealizeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//This method can be called only if
			//there's a valid selection
			//so go ahead and remove whatever's selected.

			int index = Action2.orderList.getSelectedIndex();
			Action2.orderList.remove(index);



				Action2.orderList.setSelectedIndex(index);
				Action2.orderList.ensureIndexIsVisible(index);
			}
		}

	static class Action3 implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			JFrame frame3 = new JFrame("Zarzadzaj magazynem");
			frame3.setVisible(true);
			frame3.setSize(300,200);
			JPanel panel3 = new JPanel();
			frame3.add(panel3);
		}
	}
	static class Action4 implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			JFrame frame4 = new JFrame("Zarzadzaj personelem");
			frame4.setVisible(true);
			frame4.setSize(300,200);
			JPanel panel4 = new JPanel();
			frame4.add(panel4);
		}
	}



}
