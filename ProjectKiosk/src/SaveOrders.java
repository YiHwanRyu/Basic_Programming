import java.util.ArrayList;

public class SaveOrders {
	private ArrayList<OrderList> data = new ArrayList<OrderList>();

	public void saveOrdersData(int choiceTicket, int age, int ticketCounts, 
									int priceResult, int specialOffers) {
		OrderList orderList = new OrderList();
		orderList.setDayOrNight(choiceTicket);
		orderList.setSortOfAge(age);
		orderList.setTicketCounts(ticketCounts);
		orderList.setPriceResult(priceResult);
		orderList.setSpecialOffers(specialOffers);
		data.add(orderList);
	}

	public ArrayList<OrderList> getData() {
		return data;
	}
/*
	public void setData(ArrayList<OrderList> data) {
		this.data = data;
	}
	
*/
	
}
