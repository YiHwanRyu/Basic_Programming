
public class SaveOrders {

	int[][] saveOrdersOfRow(int choiceTicket, int age, int ticketCounts, int priceResult, 
							int specialOffers, int position, int[][] orderList) {
		orderList[position][0] = choiceTicket;
		orderList[position][1] = age;
		orderList[position][2] = ticketCounts;
		orderList[position][3] = priceResult;
		orderList[position][4] = specialOffers;
		return orderList;
	}
	

}
