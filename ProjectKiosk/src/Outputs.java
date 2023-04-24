import java.util.List;

public class Outputs {
	// Objects for this class
	private PrintForInputs printForInputs = null; 
	// Constructor
	Outputs() {
		printForInputs = new PrintForInputs(); 
	}
	
	void printResultOfRow(int result) {
		System.out.println(Constants.PRICE_MESSAGE + " : " + result + " " + Constants.UNIT_MESSAGE);
	}
	
	void printResultOfOrder(List<OrderList> data, int moneyOfOrder) {
		printForInputs.printEnd();
		System.out.println("*********************************************************************");
		for (int i = 0; i < data.size(); i++) {
			String dayOrNight = "";
			String sortOfAge = "";
			String specialOrder = "";
			if (data.get(i).getDayOrNight() == Constants.DAY) {
				dayOrNight = Constants.CHOSING_TICKET_MESSAGE_DAY;
			} else if(data.get(i).getDayOrNight() == Constants.NIGHT) {
				dayOrNight = Constants.CHOSING_TICKET_MESSAGE_NIGHT;
			}
			
			if (data.get(i).getSortOfAge() == Constants.BABY) {
				sortOfAge = Constants.BABY_MESSAGE;
			} else if(data.get(i).getSortOfAge() == Constants.CHILD) {
				sortOfAge = Constants.CHILD_MESSAGE;
			} else if(data.get(i).getSortOfAge() == Constants.TEEN) {
				sortOfAge = Constants.TEEN_MESSAGE;
			} else if(data.get(i).getSortOfAge() == Constants.ADULT) {
				sortOfAge = Constants.ADULT_MESSAGE;
			} else if(data.get(i).getSortOfAge() == Constants.OLD) {
				sortOfAge = Constants.OLD_MESSAGE;
			} 
			
			if (data.get(i).getSpecialOffers() == Constants.NONE) {
				specialOrder = Constants.SPECIALORDERS_MESSAGE_NONE;
			} else if(data.get(i).getSpecialOffers() == Constants.DIFFICULTY) {
				specialOrder = Constants.SPECIALORDERS_MESSAGE_DIFFICULTY;
			} else if(data.get(i).getSpecialOffers() == Constants.MERIT) {
				specialOrder = Constants.SPECIALORDERS_MESSAGE_MERIT;
			} else if(data.get(i).getSpecialOffers() == Constants.MULTIKIDS) {
				specialOrder = Constants.SPECIALORDERS_MESSAGE_MULTIKIDS;
			} else if(data.get(i).getSpecialOffers() == Constants.PREGNANT) {
				specialOrder = Constants.SPECIALORDERS_MESSAGE_PREGNANT;
			}
			
			System.out.println(dayOrNight + " X " + data.get(i).getTicketCounts() 
			+ " = " + data.get(i).getPriceResult() + " " +Constants.UNIT_MESSAGE  + " /" 
			+ sortOfAge + " /" + specialOrder);
		}
		System.out.println(Constants.TOTAL_MESSAGE + " : " + moneyOfOrder + " " + Constants.UNIT_MESSAGE);
		System.out.println("*********************************************************************");
	}
	// data 출력
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
			if (data.get(i).getDayOrNight() == Constants.DAY) {
				numberOfDay += data.get(i).getTicketCounts();
				moneyOfDay += data.get(i).getPriceResult();
				if (data.get(i).getSortOfAge() == Constants.BABY) {
					numberOfBabyDay += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.CHILD) {
					numberOfChildDay += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.TEEN) {
					numberOfTeenDay += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.ADULT) {
					numberOfAdultDay += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.OLD) {
					numberOfOldDay += data.get(i).getTicketCounts();
				}
				
			} else if (data.get(i).getDayOrNight() == Constants.NIGHT) {
				numberOfNight += data.get(i).getTicketCounts();
				moneyOfNight += data.get(i).getPriceResult();
				if (data.get(i).getSortOfAge() == Constants.BABY) {
					numberOfBabyNight += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.CHILD) {
					numberOfChildNight += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.TEEN) {
					numberOfTeenNight += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.ADULT) {
					numberOfAdultNight += data.get(i).getTicketCounts();
				} else if(data.get(i).getSortOfAge() == Constants.OLD) {
					numberOfOldNight += data.get(i).getTicketCounts();
				}
			}
		}
		System.out.println("=====================================================================");
		System.out.printf("<%s>\n", Constants.RESULT_MESSAGE_CHOICES);
		System.out.println(Constants.TOTAL_MESSAGE + " "  + Constants.CHOSING_TICKET_MESSAGE_DAY + " : " + numberOfDay);
		System.out.println(Constants.BABY_MESSAGE + " : " + numberOfBabyDay + " "
						+ Constants.CHILD_MESSAGE + " : " + numberOfChildDay + " " 
						+ Constants.TEEN_MESSAGE +  " : " + numberOfTeenDay + " " 
						+ Constants.ADULT_MESSAGE + " : " + numberOfAdultDay + " "
						+ Constants.OLD_MESSAGE + " : " + numberOfOldDay);
		System.out.println(Constants.TOTAL_MESSAGE + " "  + Constants.CHOSING_TICKET_MESSAGE_DAY + " " 
						+ Constants.PROFIT_MESSAGE+ " : " + moneyOfDay + " " + Constants.UNIT_MESSAGE);

		System.out.println(Constants.TOTAL_MESSAGE + " "  + Constants.CHOSING_TICKET_MESSAGE_NIGHT + " : " + numberOfNight);
		System.out.println(Constants.BABY_MESSAGE + " : " + numberOfBabyNight + " "
						+ Constants.CHILD_MESSAGE + " : " + numberOfChildNight + " " 
						+ Constants.TEEN_MESSAGE +  " : " + numberOfTeenNight + " " 
						+ Constants.ADULT_MESSAGE + " : " + numberOfAdultNight + " "
						+ Constants.OLD_MESSAGE + " : " + numberOfOldNight);
		System.out.println(Constants.TOTAL_MESSAGE + " "  + Constants.CHOSING_TICKET_MESSAGE_NIGHT + " " 
						+ Constants.PROFIT_MESSAGE+ " : " + moneyOfNight + " " + Constants.UNIT_MESSAGE);
		System.out.println("=====================================================================");
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
			if (data.get(i).getSpecialOffers() == Constants.NONE) {
				numberOfNone += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers() == Constants.DIFFICULTY) {
				numberOfDifficulty += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers() == Constants.MERIT) {
				numberOfMerit += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers() == Constants.MULTIKIDS) {
				numberOfMultiChild += data.get(i).getTicketCounts();
			} else if (data.get(i).getSpecialOffers() == Constants.PREGNANT){
				numberOfPregnant += data.get(i).getTicketCounts();
			}
			
		}
		System.out.println("=====================================================================");
		System.out.printf("<%s>\n", Constants.RESULT_MESSAGE_SPECIALORDERS);
		System.out.println(Constants.TOTAL_MESSAGE + " : " + numberOfTickets);
		System.out.println(Constants.SPECIALORDERS_MESSAGE_NONE + " : " + numberOfNone);
		System.out.println(Constants.SPECIALORDERS_MESSAGE_DIFFICULTY + " : " + numberOfDifficulty);
		System.out.println(Constants.SPECIALORDERS_MESSAGE_MERIT + " : " + numberOfMerit);
		System.out.println(Constants.SPECIALORDERS_MESSAGE_MULTIKIDS + " : " + numberOfMultiChild);
		System.out.println(Constants.SPECIALORDERS_MESSAGE_PREGNANT + " : " + numberOfPregnant);
		System.out.println("=====================================================================");
	}
	

	void printTotalReport(List<OrderList> data) {
		System.out.println("=====================================================================");
		System.out.printf("<%s>\n", Constants.REPORT_MESSAGE);
		System.out.println(Constants.HEADOFTOTAL);
		for (int i = 0; i < data.size(); i++) {
			System.out.printf("%s%3s%5s%8s%13s%8s\n", data.get(i).getDate(), data.get(i).getDayOrNight()
					, data.get(i).getSortOfAge(), data.get(i).getTicketCounts(), data.get(i).getPriceResult()
					, data.get(i).getSpecialOffers());
		}
		System.out.println("=====================================================================");
	}
	
	void printEndOfProgram(List<OrderList> data) {
		printResultOfChoice(data);
		printResultOfSpecialOrders(data);
		printTotalReport(data);
	}
	
}
