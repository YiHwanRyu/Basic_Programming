
public class OrderList {
	private String dayOrNight;
	private String sortOfAge;
	private int ticketCounts;
	private int priceResult;
	private String specialOffers;
	public String getDayOrNight() {
		return dayOrNight;
	}
	public void setDayOrNight(int dayOrNight) {
		if (dayOrNight == 1) {
			this.dayOrNight = "DAY";
		} else {
			this.dayOrNight = "NIGHT";
		}
	}
	public String getSortOfAge() {
		return sortOfAge;
	}
	public void setSortOfAge(int age) {
		if (age > Constants.MAX_ADULT) {
			this.sortOfAge = "OLD";
		} else if (age >= Constants.MIN_ADULT && age <= Constants.MAX_ADULT) {
			this.sortOfAge = "ADULT";
		} else if (age >= Constants.MIN_TEEN && age <= Constants.MAX_TEEN) {
			this.sortOfAge = "TEEN";
		} else if (age >= Constants.MIN_CHILD && age <= Constants.MAX_CHILD) {
			this.sortOfAge = "CHILD";
		} else if (age <= Constants.MIN_BABY){
			this.sortOfAge = "BABY";
		}
	}
	public int getTicketCounts() {
		return ticketCounts;
	}
	public void setTicketCounts(int ticketCounts) {
		this.ticketCounts = ticketCounts;
	}
	public int getPriceResult() {
		return priceResult;
	}
	public void setPriceResult(int priceResult) {
		this.priceResult = priceResult;
	}
	public String getSpecialOffers() {
		return specialOffers;
	}
	public void setSpecialOffers(int specialOffers) {
		if (specialOffers == 1) {
			this.specialOffers = "None of Special Order";
		} else if (specialOffers == 2) {
			this.specialOffers = "Person With Difficulty";
		} else if (specialOffers == 3) {
			this.specialOffers = "Men of national merit";
		} else if (specialOffers == 4) {
			this.specialOffers = "Multiple kids (More than two)";
		} else if (specialOffers == 5) {
			this.specialOffers = "Pregnant Woman";
		} 
	}
	
	
}
