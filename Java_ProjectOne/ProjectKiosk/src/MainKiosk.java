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
		// Variable for Main class
		int choiceOfProgram;
		// Main logic
		while ((choiceOfProgram = inputClass.inputWhichProgram()) != Constants.EXIT_MACHINE) {
			
			if (choiceOfProgram == Constants.RUNORDER) {
				dataTotal = runKiosk.runOrder();
			} else if(choiceOfProgram == Constants.DATA_ANALYZE_AND_SAVE) {
				outputs.printEndOfProgram(dataTotal);
			}
	
		}
		
	}

}
