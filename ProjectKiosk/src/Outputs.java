import java.util.ArrayList;
import java.util.List;

public class Outputs {
	SaveOrders saveOrders = new SaveOrders();
	
	void printResultOfRow(int result) {
		System.out.println("Price : " + result + " WON");
	}
	
	void printResultOfOrder(int moneyOfOrder) {
		System.out.println("***************************************************");
		for (OrderList order : saveOrders.getData()) {
			System.out.println(order.getDayOrNight() + " X " + order.getTicketCounts() 
			+ " = " + order.getPriceResult() + " WON /" + order.getSortOfAge() + " /"
			+ order.getSpecialOffers());
		}
		System.out.println("Total : " + moneyOfOrder + " WON");
		System.out.println("***************************************************");
	}
}
