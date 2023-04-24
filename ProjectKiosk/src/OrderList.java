import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrderList {
	private int dayOrNight;
	private int sortOfAge;
	private int ticketCounts;
	private int priceResult;
	private int specialOffers;
	private String date;
	
	public int getDayOrNight() {
		return dayOrNight;
	}
	public void setDayOrNight(int dayOrNight) {
		this.dayOrNight = dayOrNight;
	}
	public int getSortOfAge() {
		int sortOfAge = -1;
		if (this.sortOfAge > Constants.MAX_ADULT) {
			sortOfAge = Constants.OLD;
		} else if (this.sortOfAge >= Constants.MIN_ADULT && this.sortOfAge <= Constants.MAX_ADULT) {
			sortOfAge = Constants.ADULT;
		} else if (this.sortOfAge >= Constants.MIN_TEEN && this.sortOfAge <= Constants.MAX_TEEN) {
			sortOfAge = Constants.TEEN;
		} else if (this.sortOfAge >= Constants.MIN_CHILD && this.sortOfAge <= Constants.MAX_CHILD) {
			sortOfAge = Constants.CHILD;
		} else if (this.sortOfAge <= Constants.MIN_BABY){
			sortOfAge = Constants.BABY;
		}
		return sortOfAge;
	}
	public void setSortOfAge(int age) {
		this.sortOfAge = age;
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
	public int getSpecialOffers() {
		return specialOffers;
	}
	public void setSpecialOffers(int specialOffers) {
		this.specialOffers = specialOffers;
	}
	public String getDate() {
		return date;
	}
	public void setDate() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		this.date = now.format(dateTimeFormatter);
	}
	
}
