#include<stdio.h>
int main() {
	int year, month, days = 0, startDay;
	bool leapYear = false; 
	int monthDays[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int monthDaysLeapYear[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	printf("년도 입력: ");
	scanf("%d", &year);
	printf("월 입력: ");
	scanf("%d", &month); 
	for (int i = 1900; i < year; i++) {
		if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
			days += 366;	
		} else {
			days += 365;
		}
	}
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		leapYear = true;
	}
	for (int i = 1; i < month; i++) {
		if (leapYear) {
			days += monthDaysLeapYear[i - 1];	
		} else {
			days += monthDays[i - 1];
		}
	}

	printf("======== %d년 %d월 ==========\n", year, month);
	printf("  일  월  화  수  목  금  토 \n");
	startDay = (days + 1) % 7;// 1900년 1월 1일은 월요일 
	for (int i = 0; i < startDay; i++) {
		printf("    ");
	}
	if (leapYear) {
		for (int i = 1; i <= monthDaysLeapYear[month - 1]; i++) {
			printf("%4d", i); 
			startDay++;
			if (startDay % 7 == 0) {
				printf("\n");
			}  
		}
	} else {
		for (int i = 1; i <= monthDays[month - 1]; i++) {
			printf("%4d", i);
			startDay++;
			if (startDay % 7 == 0) {
				printf("\n");
			}  
		}
	}
	
	return 0;
}
