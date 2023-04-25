import java.time.LocalDate;

public class Calculations {
	int calculationOfAge (String personNumber) {
		int age;
		String temp = personNumber;
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		if (temp.substring(6, 7).equals("3") || temp.substring(6, 7).equals("4")) {
			age = (year - 2000) - Integer.parseInt(temp.substring(0, 2));
		} else {
			String ageRaw = "19" + temp.substring(0, 2);
			age = year - Integer.parseInt(ageRaw);
		}
		
		if (month < Integer.parseInt(temp.substring(2, 4))) {
			age--;
		} else if(month == Integer.parseInt(temp.substring(2, 4)))  {
			if(day <= Integer.parseInt(temp.substring(4, 6))) {
				age--;
			}
		}
		return age;
	}

	int calcChoiceAndAge(int age, int choiceTicket){
		int price = 0;
		if (age > Constants.MAX_ADULT) {
			if (choiceTicket == 1) {
				price = Constants.OLD_DAY_PRICE;
			} else {
				price = Constants.OLD_NIGHT_PRICE;
			}
		} else if (age >= Constants.MIN_ADULT && age <= Constants.MAX_ADULT) {
			if (choiceTicket == 1) {
				price = Constants.ADULT_DAY_PRICE;
			} else {
				price = Constants.ADULT_NIGHT_PRICE;
			}
		} else if (age >= Constants.MIN_TEEN && age <= Constants.MAX_TEEN) {
			if (choiceTicket == 1) {
				price = Constants.TEEN_DAY_PRICE;
			} else {
				price = Constants.TEEN_NIGHT_PRICE;
			}
		} else if (age >= Constants.MIN_CHILD && age <= Constants.MAX_CHILD) {
			if (choiceTicket == 1) {
				price = Constants.CHILD_DAY_PRICE;
			} else {
				price = Constants.CHILD_NIGHT_PRICE;
			}
		} else if (age <= Constants.MIN_BABY){
			price = Constants.BABY_PRICE;
		}
		return price;
	}

	int calcSpecialOffers(int tempPrice, int specialOffers){
		float price = (float)tempPrice;
		if (specialOffers == 1) {
			return tempPrice;
		} else if (specialOffers == 2) {
			price = price * Constants.DIFFICULTY_DISCOUNT_RATE;
		} else if (specialOffers == 3) {
			price = price * Constants.MERIT_DISCOUNT_RATE; 
		} else if (specialOffers == 4) {
			price = price * Constants.MULTIPLE_KIDS_DISCOUNT_RATE;
		} else if (specialOffers == 5) {
			price = price * Constants.PREGNANT_DISCOUNT_RATE;
		}
		return (int)price;
	}

	int calcTicketNumbers(int tempPrice, int ticketNumbers){
		return tempPrice * ticketNumbers;
	}	
			 
	int calculation(Inputs inputClass) {
		int tempPrice;
		int age = calculationOfAge(inputClass.getPersonNumber());
		tempPrice = calcChoiceAndAge(age, inputClass.getNumberChoiceTicket());
		tempPrice = calcSpecialOffers(tempPrice, inputClass.getSpecialOffers());
		tempPrice = calcTicketNumbers(tempPrice, inputClass.getTicketNumbers());
		return tempPrice;		
	} 		 

}