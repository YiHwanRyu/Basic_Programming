#include<stdio.h>
using namespace std;

void printChoiceTicket() {
	printf("%s\n", "Welcome to PolyLand!!");
	printf("%s\n", "Choose your type of ticket!");
	printf("%s\n", "1. Daytime");
	printf("%s\n", "2. Nighttime");	 
}

void printInputPersonNumber() {
	printf("%s\n", "Please input your Resident Registration Number!");
	printf("%s\n", "**Only input Numbers**");
}

void printInputTicketNumbers() {
	printf("%s\n", "How many tickets do you want?");
	printf("%s\n", "**Up to 10**");
}

void printSpecialOffers() {
	printf("%s\n", "Choose your special offer!");
	printf("%s\n", "1. None (Special offer for age is already applied)");
	printf("%s\n", "2. Person With Difficulty");
	printf("%s\n", "3. Men of national merit");
	printf("%s\n", "4. Multiple kids (More than two)");
	printf("%s\n", "5. Pregnant Woman");
}

void printMoreChoiceTicket() {
	printf("%s\n", "Continue to buy tickets or Exit?");
	printf("%s\n", "1. Buying ticket");
	printf("%s\n", "2. Exit");	 
}


int main() {
	int inputNumberChoiceTicket;
	int inputMoreChoiceTicket;
	int inputPersonNumber;
	int inputTicketNumbers;
	int inputSpecialOffers;
	do {	
		while (true) { 
			printChoiceTicket();
			scanf("%d", &inputNumberChoiceTicket);
			if (inputNumberChoiceTicket != 1 && inputNumberChoiceTicket != 2) {
				printf("Error! Input again!\n\n");
				continue;
			} else {
				// input other conditions & Errors(not yet)
				printInputPersonNumber(); // 13 spaces and string format
				scanf("%d", &inputPersonNumber);
				printInputTicketNumbers();// more than 10 tickets or None error
				scanf("%d", &inputTicketNumbers);
				printSpecialOffers(); 
				scanf("%d", &inputSpecialOffers);
				// print result place
				
				break;
			}	
		}
		printMoreChoiceTicket();
		scanf("%d", &inputMoreChoiceTicket);		
	} while (inputMoreChoiceTicket == 1);
	
	return 0;
}
