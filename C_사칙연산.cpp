#include<stdio.h>
int main() {
	int numberOne, numberTwo;
	printf("�ΰ��� ������ �Է��ϼ���: ");
	scanf("%d %d", &numberOne, &numberTwo);
	printf("%d + %d = %d\n", numberOne, numberTwo, numberOne + numberTwo); 
	printf("%d - %d = %d\n", numberOne, numberTwo, numberOne - numberTwo);
	printf("%d * %d = %d\n", numberOne, numberTwo, numberOne * numberTwo);
	printf("%d / %d = %d", numberOne, numberTwo, numberOne / numberTwo);

	return 0;
}
