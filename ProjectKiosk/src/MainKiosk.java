import java.util.ArrayList;
import java.util.List;

public class MainKiosk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		List<OrderList> data = new ArrayList<OrderList>();
		List<OrderList> dataTotal = new ArrayList<OrderList>();
		int moneyOfRow;
		int moneyOfOrder = 0;
		int moreChoiceTicket;
		int isExit;
		// Objects for Main class
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
				outputs.printResultOfRow(moneyOfRow);
				data = saveOrders.saveOrdersData(data, inputClass.getNumberChoiceTicket(), age, inputClass.getTicketNumbers(), 
												moneyOfRow, inputClass.getSpecialOffers());
				moreChoiceTicket = inputClass.inputMoreChoiceTicket();
				if (moreChoiceTicket == 2) {
					printForInputsClass.printEnd();
					outputs.printResultOfOrder(data, moneyOfOrder);
					dataTotal.addAll(data);
					break;
				}		
			}
			isExit = inputClass.inputIsExit();
			//Initialization of data
			data = new ArrayList<OrderList>();
			moneyOfOrder = 0;

		} while (isExit == 1);
		//Total outputs
		outputs.printResultOfChoice(dataTotal);
		outputs.printResultOfSpecialOrders(dataTotal);
		outputs.printTotalReport(dataTotal);
	}

}
