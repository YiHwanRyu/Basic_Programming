
public class MainKiosk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		int moreChoiceTicket;
		int isExit;
		
		// Object for this class
		Inputs inputClass = new Inputs();
		
		// Main logic
		do {	
			while (true) { 
				inputClass.inputData();
				
				moreChoiceTicket = inputClass.inputMoreChoiceTicket();
				if (moreChoiceTicket == 2) {
					break;
				}		
			}
			isExit = inputClass.inputIsExit();
		} while (isExit == 1);
		
	}

}
