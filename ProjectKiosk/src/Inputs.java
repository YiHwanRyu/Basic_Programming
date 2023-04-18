import java.util.Scanner;

public class Inputs {
	// Variables
	private int numberChoiceTicket;
	private String personNumber;
	private int ticketNumbers;
	private int specialOffers;
	// Objects for this class
	private Scanner scanner = new Scanner(System.in); 
	private PrintForInputs printForInputs = new PrintForInputs(); 
	// Methods of inputs
	int inputNumberChoiceTicket(){
		printForInputs.printChoiceTicket();
		int number = scanner.nextInt();
		return number;
	}
	String inputPersonNumber(){
		printForInputs.printInputPersonNumber();
		String number = scanner.next();
		return number;
	}
	int inputTicketNumbers(){
		printForInputs.printInputTicketNumbers();
		int number = scanner.nextInt();
		return number;
	}
	int inputSpecialOffers(){
		printForInputs.printSpecialOffers(); 
		int number = scanner.nextInt();
		return number;
	}
	
	void inputData() {
		setNumberChoiceTicket(inputNumberChoiceTicket());
		setPersonNumber(inputPersonNumber());
		setTicketNumbers(inputTicketNumbers());
		setSpecialOffers(inputSpecialOffers());	   	
	}
	
	int inputMoreChoiceTicket(){
		printForInputs.printMoreChoiceTicket();
		int number = scanner.nextInt();
		return number;
	}
	
	int inputIsExit(){
		printForInputs.printIsExit();
		int number = scanner.nextInt();
		return number;
	}
	
	// getter, setter
	public int getNumberChoiceTicket() {
		return numberChoiceTicket;
	}
	public void setNumberChoiceTicket(int numberChoiceTicket) {
		this.numberChoiceTicket = numberChoiceTicket;
	}
	public String getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
	public int getTicketNumbers() {
		return ticketNumbers;
	}
	public void setTicketNumbers(int ticketNumbers) {
		this.ticketNumbers = ticketNumbers;
	}
	public int getSpecialOffers() {
		return specialOffers;
	}
	public void setSpecialOffers(int specialOffers) {
		this.specialOffers = specialOffers;
	}
}
