import java.util.List;


public class SaveOrders {
	// Objects for this class
	private OrderList orderList = null; 
	private Outputs outputClass = null;
	private Calculations calculationClass = null;
	// Constructor
	SaveOrders() {
		orderList = new OrderList();
		outputClass = new Outputs();
		calculationClass = new Calculations();
	}
	List<OrderList> saveOrdersData(List<OrderList> data, int priceResult, Inputs inputClass) {
		outputClass.printResultOfRow(priceResult);
		
		orderList = new OrderList();
		orderList.setDayOrNight(inputClass.getNumberChoiceTicket());
		orderList.setSortOfAge(calculationClass.calculationOfAge(inputClass.getPersonNumber()));
		orderList.setTicketCounts(inputClass.getTicketNumbers());
		orderList.setPriceResult(priceResult);
		orderList.setSpecialOffers(inputClass.getSpecialOffers());
		orderList.setDate();
		data.add(orderList);
		return data;
	}

}
