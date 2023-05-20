import java.util.Scanner;

public class Inputs {
	// Variables
	private int numberChoiceTicket;
	private String personNumber;
	private int ticketNumbers;
	private int specialOffers;
	// Objects for this class
	private Scanner scanner = null; 
	private Constants constants = null;
	private PrintForInputs printForInputs = null;
	// Constructor
	Inputs() {
		scanner = new Scanner(System.in); 
		printForInputs = new PrintForInputs();
		constants = new Constants(); 
	}
	
	// Methods of inputs
	int inputWhichProgram(){
		constants.languageSelect();
		int number;
		do {
		printForInputs.printChoiceProgram();
		number = scanner.nextInt();
		} while (number != 1 && number != 2 && number !=3);
		return number;
	}
	
	int inputNumberChoiceTicket(){
		int number;
		do {
		printForInputs.printChoiceTicket();
		number = scanner.nextInt();
		} while (number != 1 && number != 2);
		return number;
	}
	String inputPersonNumber(){
		String number = "";
		do {
		printForInputs.printInputPersonNumber();
		number = scanner.next();
		} while (number.length() != 13);
		return number;
	}
	int inputTicketNumbers(){
		int number;
		do {
		printForInputs.printInputTicketNumbers();
		number = scanner.nextInt();
		} while (number < 0 || number > 10);
		return number;
	}
	int inputSpecialOffers(){
		int number;
		do {
		printForInputs.printSpecialOffers(); 
		number = scanner.nextInt();
		} while (!(number >= 1 && number <= 5));
		return number;
	}
	
	void inputData() {
		setNumberChoiceTicket(inputNumberChoiceTicket());
		setPersonNumber(inputPersonNumber());
		setTicketNumbers(inputTicketNumbers());
		setSpecialOffers(inputSpecialOffers());	  
	}
	
	int inputMoreChoiceTicket(){
		int number;
		do {
			printForInputs.printMoreChoiceTicket();
		number = scanner.nextInt();
		} while (number != 1 && number != 2);
		return number;
	}
	
	int inputIsExit(){
		int number;
		do {
			printForInputs.printIsExit();
		number = scanner.nextInt();
		} while (number != 1 && number != 2);
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
