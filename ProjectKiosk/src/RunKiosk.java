import java.util.ArrayList;
import java.util.List;

public class RunKiosk {
	// Variables
	private int moneyOfRow;
	private int moneyOfOrder;
	// Objects for RunKiosk class
	private List<OrderList> data = null;
	private List<OrderList> dataTotal = null;
	private Inputs inputClass = null;
	private Calculations calculationsClass = null;
	private Outputs outputClass = null;
	private SaveOrders saveOrderClass = null;
	// Constructor
	RunKiosk() {
		data = new ArrayList<OrderList>();
		dataTotal = new ArrayList<OrderList>();
		inputClass = new Inputs();
		calculationsClass = new Calculations();
		outputClass = new Outputs();
		saveOrderClass = new SaveOrders();
	}
	// runOrder
	List<OrderList> runOrder() {
		do {
			while (true) { 
				//Inputs
				inputClass.inputData();
						
				//Calculations
				moneyOfRow = calculationsClass.calculation(inputClass);
				moneyOfOrder += moneyOfRow;
						
				//Save and outputs of row
				data = saveOrderClass.saveOrdersData(data, moneyOfRow, inputClass);
						
				//Save data and Question about another order
				if (inputClass.inputMoreChoiceTicket() == Constants.NO) {
					dataTotal.addAll(outputClass.printResultOfOrder(data, moneyOfOrder));
					break;
				}		
			}
			//Initialization of data
			data = new ArrayList<OrderList>();
			moneyOfOrder = 0;	
		
		} while (inputClass.inputIsExit() == Constants.NEW_ORDER);	
		return dataTotal;
	}
}
