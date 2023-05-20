#include<stdio.h>
int main() {
	int numberOne, numberTwo;
	//글꼴변경 d2coding
	printf("두 개의 정수를 입력하세요: ");
	scanf("%d %d", &numberOne, &numberTwo);
	printf("%d + %d = %d\n", numberOne, numberTwo, numberOne + numberTwo); 
	printf("%d - %d = %d\n", numberOne, numberTwo, numberOne - numberTwo);
	printf("%d * %d = %d\n", numberOne, numberTwo, numberOne * numberTwo);
	printf("%.f / %.f = %.1f", (float)numberOne, (float)numberTwo, (float)numberOne / (float)numberTwo);
	
	return 0;
} 
