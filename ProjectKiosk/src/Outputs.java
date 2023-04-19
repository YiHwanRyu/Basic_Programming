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
	
	void printResultOfChoice(List<OrderList> data) {
		int numberOfDay = 0;
		int numberOfNight = 0;
		int moneyOfDay = 0;
		int moneyOfNight = 0;
		int numberOfBabyDay = 0;
		int numberOfChildDay = 0;
		int numberOfTeenDay = 0;
		int numberOfAdultDay = 0;
		int numberOfOldDay = 0;
		int numberOfBabyNight = 0;
		int numberOfChildNight = 0;
		int numberOfTeenNight = 0;
		int numberOfAdultNight = 0;
		int numberOfOldNight = 0;
		
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getDayOrNight().equals("DAY")) {
				numberOfDay += data.get(i).getTicketCounts();
				moneyOfDay += data.get(i).getPriceResult();
				if (data.get(i).getSortOfAge().equals("BABY")) {
					numberOfBabyDay += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("CHILD")) {
					numberOfChildDay += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("TEEN")) {
					numberOfTeenDay += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("ADULT")) {
					numberOfAdultDay += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("OLD")) {
					numberOfOldDay += data.get(i).getTicketCounts();;
				}
				
			} else if (data.get(i).getDayOrNight().equals("NIGHT")) {
				numberOfNight += data.get(i).getTicketCounts();;
				moneyOfNight += data.get(i).getPriceResult();
				if (data.get(i).getSortOfAge().equals("BABY")) {
					numberOfBabyNight += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("CHILD")) {
					numberOfChildNight += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("TEEN")) {
					numberOfTeenNight += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("ADULT")) {
					numberOfAdultNight += data.get(i).getTicketCounts();;
				} else if(data.get(i).getSortOfAge().equals("OLD")) {
					numberOfOldNight += data.get(i).getTicketCounts();;
				}
			}
		}
		System.out.println("============== Total Result Of Choices ============");
		System.out.println("DAY Total : " + numberOfDay);
		System.out.println("BABY : " + numberOfBabyDay + " " + "CHILD : " + numberOfChildDay + " " + 
						   "TEEN : " + numberOfTeenDay + " " + "ADULT : " + numberOfAdultDay + " " +
						   "OLD : " + numberOfOldDay);
		System.out.println("DAY Profit Total : " + moneyOfDay + " WON\n");
		System.out.println("NIGHT Total : " + numberOfNight);
		System.out.println("BABY : " + numberOfBabyNight + " " + "CHILD : " + numberOfChildNight + " " + 
						   "TEEN : " + numberOfTeenNight + " " + "ADULT : " + numberOfAdultNight + " " +
			         	   "OLD : " + numberOfOldNight);
		System.out.println("NIGHT Profit Total : " + moneyOfNight + " WON");
		System.out.println("===================================================");
	}
	
	void printResultOfSpecialOrders(List<OrderList> data) {
		int numberOfTickets = 0;
		int numberOfNone = 0;
		int numberOfDifficulty = 0;
		int numberOfMerit = 0;
		int numberOfMultiChild = 0;
		int numberOfPregnant = 0;
		for (int i = 0; i < data.size(); i++) {
			numberOfTickets += data.get(i).getTicketCounts();
			if (data.get(i).getSpecialOffers().equals("None of Special Order")) {
				numberOfNone += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers().equals("Person With Difficulty")) {
				numberOfDifficulty += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers().equals("Men of national merit")) {
				numberOfMerit += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers().equals("Multiple kids (More than two)")) {
				numberOfMultiChild += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers().equals("Pregnant Woman")) {
				numberOfPregnant += data.get(i).getTicketCounts();
			}
			
		}
		System.out.println("========= Total Result Of Special Orders ==========");
		System.out.println("Total Tickets : " + numberOfTickets);
		System.out.println("None of Special Order : " + numberOfNone);
		System.out.println("Person With Difficulty : " + numberOfDifficulty);
		System.out.println("Men of national merit : " + numberOfMerit);
		System.out.println("Multiple kids (More than two) : " + numberOfMultiChild);
		System.out.println("Pregnant Woman : " + numberOfPregnant);
		System.out.println("===================================================");
	}
}
