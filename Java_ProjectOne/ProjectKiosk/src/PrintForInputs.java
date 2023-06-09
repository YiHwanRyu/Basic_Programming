

public class PrintForInputs {
	
	void printChoiceProgram() {
		System.out.println(Constants.PROGRAM_MESSAGE);
		System.out.println(Constants.CHOSING_PROGRAM_MESSAGE);
		System.out.println("1. " + Constants.CHOSING_PROGRAM_MESSAGE_RUN);
		System.out.println("2. " + Constants.CHOSING_PROGRAM_MESSAGE_DATA);
		System.out.println("3. " + Constants.CHOSING_PROGRAM_MESSAGE_OFF);
	
	}

	void printChoiceTicket() {
		System.out.println(Constants.WELLCOME_MESSAGE);
		System.out.println(Constants.CHOSING_TICKET_MESSAGE);
		System.out.println("1. " + Constants.CHOSING_TICKET_MESSAGE_DAY);
		System.out.println("2. " + Constants.CHOSING_TICKET_MESSAGE_NIGHT);
	}

	void printInputPersonNumber() {
		System.out.println(Constants.PERSONNUMBER_MESSAGE);
		System.out.println(Constants.PERSONNUMBER_MESSAGE_NOTICE);
	}

	void printInputTicketNumbers() {
		System.out.println(Constants.COUNTS_MESSAGE);
		System.out.println(Constants.COUNTS_MESSAGE_NOTICE);
	}

	void printSpecialOffers() {
		System.out.println(Constants.SPECIALORDERS_MESSAGE);
		System.out.println("1. " + Constants.SPECIALORDERS_MESSAGE_NONE);
		System.out.println("2. " + Constants.SPECIALORDERS_MESSAGE_DIFFICULTY);
		System.out.println("3. " + Constants.SPECIALORDERS_MESSAGE_MERIT);
		System.out.println("4. " + Constants.SPECIALORDERS_MESSAGE_MULTIKIDS);
		System.out.println("5. " + Constants.SPECIALORDERS_MESSAGE_PREGNANT);
	}

	void printMoreChoiceTicket() {
		System.out.println(Constants.BUYING_MESSAGE);
		System.out.println(Constants.BUYING_MESSAGE_TICKET);
		System.out.println(Constants.BUYING_MESSAGE_EXIT);
	}
	
	void printIsExit() {
		System.out.println(Constants.CONTINUE_MESSAGE);
	}
	
	void printEnd() {
		System.out.println(Constants.END_MESSAGE);
	}

}
