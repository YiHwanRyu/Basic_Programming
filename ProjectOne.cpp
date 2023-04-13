#include<stdio.h>
#include<string>
#include<time.h>
#include<stdlib.h>
#include<iostream>
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

int func_inputPersonNumber (string *inputPersonNumber) {
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

int main() {
	int inputNumberChoiceTicket;
	int inputMoreChoiceTicket;
	string inputPersonNumber = "";
	int inputTicketNumbers;
	int inputSpecialOffers;
	int age;

	do {	
		while (true) { 
			printChoiceTicket();
			scanf("%d", &inputNumberChoiceTicket);
			if (inputNumberChoiceTicket != 1 && inputNumberChoiceTicket != 2) {
				printf("Ticket Type Error! Input again!\n\n");
				continue;
			} else {
				// input other conditions & Errors(not yet)
				printInputPersonNumber(); // 13 spaces and string format
				cin >> inputPersonNumber;
				if (inputPersonNumber.size() != 13) {
					printf("Resident Registration Number Error! Input again!\n\n");
					continue;
				}	
				age = func_inputPersonNumber(&inputPersonNumber);
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
