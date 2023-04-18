import java.util.List;

public class SaveOrders {

	List<OrderList> saveOrdersData(List<OrderList> data, int choiceTicket, int age, int ticketCounts, 
									int priceResult, int specialOffers) {
		OrderList orderList = new OrderList();
		orderList.setDayOrNight(choiceTicket);
		orderList.setSortOfAge(age);
		orderList.setTicketCounts(ticketCounts);
		orderList.setPriceResult(priceResult);
		orderList.setSpecialOffers(specialOffers);
		data.add(orderList);
		return data;
	}

}
