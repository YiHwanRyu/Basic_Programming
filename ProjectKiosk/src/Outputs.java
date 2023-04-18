
public class Outputs {
	
	void printResultOfRow(int result) {
		System.out.println("Price : " + result + " WON");
	}
	
	void printResultOfOrder(int[][] orderList, int position, int moneyOfOrder) {
		System.out.println("***************************************************");
		for (int i = 0; i < position; i++) {
			String dayOrNight;
			String specialOffers = "";
			String sortOfAge = "";
			
			if (orderList[i][0] == 1) {
				dayOrNight = "DAY";
			} else {
				dayOrNight = "NIGHT";
			}
			
			if (orderList[i][4] == 1) {
				specialOffers = "None of Special Order";
			} else if (orderList[i][4] == 2) {
				specialOffers = "Person With Difficulty";
			} else if (orderList[i][4] == 3) {
				specialOffers = "Men of national merit";
			} else if (orderList[i][4] == 4) {
				specialOffers = "Multiple kids (More than two)";
			} else if (orderList[i][4] == 5) {
				specialOffers = "Pregnant Woman";
			} 
			
			if (orderList[i][1] > Constants.MAX_ADULT) {
				sortOfAge = "OLD";
			} else if (orderList[i][1] >= Constants.MIN_ADULT && orderList[i][1] <= Constants.MAX_ADULT) {
				sortOfAge = "ADULT";
			} else if (orderList[i][1] >= Constants.MIN_TEEN && orderList[i][1] <= Constants.MAX_TEEN) {
				sortOfAge = "TEEN";
			} else if (orderList[i][1] >= Constants.MIN_CHILD && orderList[i][1] <= Constants.MAX_CHILD) {
				sortOfAge = "CHILD";
			} else if (orderList[i][1] <= Constants.MIN_BABY){
				sortOfAge = "BABY";
			}
			System.out.println(dayOrNight + " X " + orderList[i][2] + " = " + orderList[i][3] + " WON / " + sortOfAge + " / " + specialOffers);
		}
		System.out.println("Total : " + moneyOfOrder + " WON");
		System.out.println("***************************************************");
	}
}
