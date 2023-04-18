
public class MainKiosk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		int [][] orderList = new int [100][5];
		int moneyOfRow;
		int moneyOfOrder = 0;
		int moreChoiceTicket;
		int isExit;
		int position = 0;
		// Object for this class
		PrintForInputs printForInputsClass = new PrintForInputs();
		Inputs inputClass = new Inputs();
		Calculations calculationsClass = new Calculations();
		Outputs outputs = new Outputs();
		SaveOrders saveOrders = new SaveOrders();
		// Main logic
		do {	
			while (true) { 
				//Inputs
				inputClass.inputData();
				//Calculations
				int age = calculationsClass.calculationOfAge(inputClass.getPersonNumber());
				moneyOfRow = calculationsClass.calculation(inputClass.getPersonNumber(), inputClass.getNumberChoiceTicket(), 
														   inputClass.getTicketNumbers(), inputClass.getSpecialOffers(), age);
				moneyOfOrder += moneyOfRow;
				//Save and outputs of row
				orderList = saveOrders.saveOrdersOfRow(inputClass.getNumberChoiceTicket(), age, inputClass.getTicketNumbers(), 
														moneyOfRow, inputClass.getSpecialOffers(), position, orderList);
				position++;
				outputs.printResultOfRow(moneyOfRow);
				//More choices
				moreChoiceTicket = inputClass.inputMoreChoiceTicket();
				if (moreChoiceTicket == 2) {
					printForInputsClass.printEnd();
					outputs.printResultOfOrder(orderList, position, moneyOfOrder);
					break;
				}		
			}
			isExit = inputClass.inputIsExit();
			//Initialization of orderList
			orderList = new int [100][5];
			position = 0;
			moneyOfOrder = 0;

		} while (isExit == 1);
		
	}

}
