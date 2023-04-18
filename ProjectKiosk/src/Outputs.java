import java.util.List;

public class Outputs {
	
	void printResultOfRow(int result) {
		System.out.println("Price : " + result + " WON");
	}
	
	void printResultOfOrder(List<OrderList> data, int moneyOfOrder) {
		System.out.println("***************************************************");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getDayOrNight() + " X " + data.get(i).getTicketCounts() 
			+ " = " +data.get(i).getPriceResult() + " WON /" + data.get(i).getSortOfAge() + " /"
			+ data.get(i).getSpecialOffers());
		}
		System.out.println("Total : " + moneyOfOrder + " WON");
		System.out.println("***************************************************");
	}
}
