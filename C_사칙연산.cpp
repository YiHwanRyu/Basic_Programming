#include<stdio.h>
int main() {
	int numberOne, numberTwo;
	printf("두개의 정수를 입력하세요: ");
	scanf("%d %d", &numberOne, &numberTwo);
	printf("%d + %d = %d\n", numberOne, numberTwo, numberOne + numberTwo); 
	printf("%d - %d = %d\n", numberOne, numberTwo, numberOne - numberTwo);
	printf("%d * %d = %d\n", numberOne, numberTwo, numberOne * numberTwo);
	printf("%d / %d = %d", numberOne, numberTwo, numberOne / numberTwo);

	return 0;
}
