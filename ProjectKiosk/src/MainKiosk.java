import java.util.ArrayList;
import java.util.List;

public class MainKiosk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objects for Main class
		List<OrderList> dataTotal = new ArrayList<OrderList>();
		Inputs inputClass = new Inputs();
		Outputs outputs = new Outputs();
		RunKiosk runKiosk = new RunKiosk();
		// Main logic
		do {	
			dataTotal = runKiosk.runOrder();	
		} while (inputClass.inputIsExit() == Constants.NEW_ORDER);
		
		//Total outputs
		outputs.printEndOfProgram(dataTotal);
	}

}
