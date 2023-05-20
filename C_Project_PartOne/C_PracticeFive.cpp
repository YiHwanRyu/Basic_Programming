#include<stdio.h>
int main() {
	int year;
	printf("원하는 년도를 입력하세요 : ");
	scanf("%d", &year);
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		printf("1월 : 31일\n2월 : 29일\n3월 : 31일\n4월 : 30일\n5월 : 31일\n6월 : 30일\n");
		printf("7월 : 31일\n8월 : 31일\n9월 : 30일\n10월 : 31일\n11월 : 30일\n12월 : 31일");
	} else {
		printf("1월 : 31일\n2월 : 28일\n3월 : 31일\n4월 : 30일\n5월 : 31일\n6월 : 30일\n");
		printf("7월 : 31일\n8월 : 31일\n9월 : 30일\n10월 : 31일\n11월 : 30일\n12월 : 31일");
	} 
	return 0;
}
