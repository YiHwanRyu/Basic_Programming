import java.util.List;


public class SaveOrders {
	// Objects for this class
	private OrderList orderList = null; 
	// Constructor
	SaveOrders() {
		orderList = new OrderList(); 
	}
	List<OrderList> saveOrdersData(List<OrderList> data, int choiceTicket, int age, int ticketCounts, 
									int priceResult, int specialOffers) {
		orderList = new OrderList();
		orderList.setDayOrNight(choiceTicket);
		orderList.setSortOfAge(age);
		orderList.setTicketCounts(ticketCounts);
		orderList.setPriceResult(priceResult);
		orderList.setSpecialOffers(specialOffers);
		data.add(orderList);
		return data;
	}

}
