import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static java.lang.Integer.parseInt;


/**
 * Created by Kuba Sanecki on 26.11.2016.
 */
public class Order {


	static String pickedFlower = Main.Action1.flowerList.getSelectedItem().toString() ;
	static int pickedNOFlowers = Integer.parseInt(Main.Action1.numberOfFlowers);
	static String pickedName = Main.Action1.userName;
	static String pickedSurname = Main.Action1.userSurname;
	static String pickedAddress = Main.Action1.userAddress;

	static List<Object> listOfOrders = new ArrayList<>();


	private Order(String pickedFlower, int pickedNOFlowers, String pickedName, String pickedSurname, String pickedAddress) {

		Order.pickedFlower = pickedFlower;
		Order.pickedNOFlowers = pickedNOFlowers;
		Order.pickedName = pickedName;
		Order.pickedSurname = pickedSurname;
		Order.pickedAddress = pickedAddress;
	}

	static Order objectOrder = new Order(pickedFlower, pickedNOFlowers, pickedName, pickedSurname, pickedAddress);


}




