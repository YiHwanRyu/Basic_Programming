#include<stdio.h>
#include<string>
#include<time.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
// Constants
const int BABY_PRICE = 0,
		 ADULT_DAY_PRICE = 56000, ADULT_NIGHT_PRICE = 46000,
		 TEEN_DAY_PRICE = 47000, TEEN_NIGHT_PRICE = 40000,
		 CHILD_DAY_PRICE = 44000, CHILD_NIGHT_PRICE = 37000,
		 OLD_DAY_PRICE = 44000, OLD_NIGHT_PRICE = 37000;
const int MIN_BABY = 2, 
		 MIN_CHILD = 3, MIN_TEEN = 13, MIN_ADULT = 19,
		 MAX_CHILD = 12, MAX_TEEN = 18, MAX_ADULT = 64;
const int BABY = 1, CHILD = 2, TEEN = 3, ADULT = 4, OLD = 5;
const float  DIFFICULTY_DISCOUNT_RATE = 0.6, MERIT_DISCOUNT_RATE = 0.5,
			MULTIPLE_KIDS_DISCOUNT_RATE = 0.8, PREGNANT_DISCOUNT_RATE = 0.85;
const int MAX_TICKET_COUNT = 10, MIN_TICKET_COUNT = 1;

// Printing for inputs
void printChoiceTicket();
void printInputPersonNumber();
void printInputTicketNumbers();
void printSpecialOffers();
void printMoreChoiceTicket();

// Inputs
int inputNumberChoiceTicket();
string inputPersonNumber();
int inputTicketNumbers();
int inputSpecialOffers();
void inputData(int *choiceTicket, string *personNumber, 
			   int *ticketNumbers, int *specialOffers); 
			   
//Calculations			   
int calculationOfAge(string *inputPersonNumber);
int calcChoiceAndAge(int age, int choiceTicket);
int calcSpecialOffers(int tempPrice, int specialOffers);
int calcTicketNumbers(int tempPrice, int ticketNumbers);			   
int calculation(string personNumber, int choiceTicket, 
				int ticketNumbers, int specialOffers, int *age); 	
//Saving orders
void saveOrders(int choiceTicket, int age, int ticketCounts,
				int priceResult, int specialOffers,
				int *position, int(*orderList)[5]);					   
				
				
int main() {
	// Variables for calculation
	int choiceTicket;
	string personNumber = "";
	int ticketNumbers;
	int specialOffers;
	int age;
	int moreChoiceTicket;
	int isExit;
	// Varialbes for printing files
	int priceOneRow;
	int totalPrice;
	int position;
	int filePosition;
	int reportPosition;
	int orderList[100][5] = { 0 }; 
	// Main logic
	do {	
		while (true) { 
			inputData(&choiceTicket, &personNumber, &ticketNumbers, &specialOffers);
			
			printMoreChoiceTicket();
			scanf("%d" , &moreChoiceTicket);
			if (moreChoiceTicket == 2) {
				break;
			}		
		}
		printf("Continue? (1: New Order, 2: Exit Program) : ");
		scanf("%d", &isExit);	
				
	} while (isExit == 1);
	
	return 0;
}

void printChoiceTicket() {
	printf("\n%s\n", "Welcome to PolyLand!!");
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

int inputNumberChoiceTicket(){
	int number;
	printChoiceTicket();
	scanf("%d", &number);
	return number;
}
string inputPersonNumber(){
	string number;
	printInputPersonNumber();
	cin >> number;
	return number;
}
int inputTicketNumbers(){
	int number;
	printInputTicketNumbers();
	scanf("%d", &number);
	return number;
}
int inputSpecialOffers(){
	int number;
	printSpecialOffers(); 
	scanf("%d", &number);
	return number;
}
void inputData(int *numberChoiceTicket, string *personNumber, 
			   int *ticketNumbers, int *specialOffers) {
	*numberChoiceTicket = inputNumberChoiceTicket();
	*personNumber = inputPersonNumber();
	*ticketNumbers = inputTicketNumbers();
	*specialOffers = inputSpecialOffers();
		   	
}
int calculationOfAge (string *inputPersonNumber) {
	int age = 0;
	string temp = *inputPersonNumber;
	time_t timeNow;
	struct tm* timeNowChange;
	timeNow = time(NULL);
	timeNowChange = localtime(&timeNow);
	int year = timeNowChange -> tm_year + 1900;
	int month = timeNowChange -> tm_mon + 1;
	int day = timeNowChange -> tm_mday;
	if (temp.substr(6, 1) == "3" || temp.substr(6, 1) == "4") {
		age = 23 - atoi(temp.substr(0, 2).c_str());
	} else {
		string ageRaw = "";
		ageRaw = "19" + temp.substr(0, 2);
		age = 2023 - atoi(ageRaw.c_str());
	}
	
	if (month < atoi(temp.substr(2, 2).c_str())) {
		age--;
	} else if(month == atoi(temp.substr(2, 2).c_str()))  {
		if(day <= atoi(temp.substr(4, 2).c_str())) {
			age--;
		}
	}
	return age;
}

int calcChoiceAndAge(int age, int choiceTicket){
	int price = 0;
	if (age > MAX_ADULT) {
		if (choiceTicket == 1) {
			price = OLD_DAY_PRICE;
		} else {
			price = OLD_NIGHT_PRICE;
		}
	} else if (age >= MIN_ADULT && age <= MAX_ADULT) {
		if (choiceTicket == 1) {
			price = ADULT_DAY_PRICE;
		} else {
			price = ADULT_NIGHT_PRICE;
		}
	} else if (age >= MIN_TEEN && age <= MAX_TEEN) {
		if (choiceTicket == 1) {
			price = TEEN_DAY_PRICE;
		} else {
			price = TEEN_NIGHT_PRICE;
		}
	} else if (age >= MIN_CHILD && age <= MAX_CHILD) {
		if (choiceTicket == 1) {
			price = CHILD_DAY_PRICE;
		} else {
			price = CHILD_NIGHT_PRICE;
		}
	} else if (age <= MIN_BABY){
		price = BABY_PRICE;
	}
	return price;
}

int calcSpecialOffers(int tempPrice, int specialOffers){
	int price = 0;
	if (specialOffers == 1) {
		return price;
	} else if (specialOffers == 2) {
		price *= DIFFICULTY_DISCOUNT_RATE;
	} else if (specialOffers == 3) {
		price *= MERIT_DISCOUNT_RATE; 
	} else if (specialOffers == 4) {
		price *= MULTIPLE_KIDS_DISCOUNT_RATE;
	} else if (specialOffers == 5) {
		price *= PREGNANT_DISCOUNT_RATE;
	}
	return price;
}

int calcTicketNumbers(int tempPrice, int ticketNumbers){
	return tempPrice * ticketNumbers;
}	

int calculation(string personNumber, int choiceTicket, 
				int ticketNumbers, int specialOffers, int *age) {
	int tempPrice;
	*age = calculationOfAge(&personNumber);
	tempPrice = calcChoiceAndAge(*age, choiceTicket);
	tempPrice = calcSpecialOffers(tempPrice, specialOffers);
	tempPrice = calcTicketNumbers(tempPrice, ticketNumbers);
	return tempPrice;		
} 		 
void saveOrders(int choiceTicket, int age, int ticketCounts,
				int priceResult, int specialOffers,
				int *position, int(*orderList)[5]) {
	orderList[*position][0] = choiceTicket;
	orderList[*position][1] = age;
	orderList[*position][2] = ticketCounts;
	orderList[*position][3] = priceResult;
	orderList[*position][4] = specialOffers;
	(*position) += 1;
}



