#include<stdio.h>
int main() {
	int numberOne, numberTwo;
	//�۲ú��� d2coding
	printf("�� ���� ������ �Է��ϼ���: ");
	scanf("%d %d", &numberOne, &numberTwo);
	printf("%d + %d = %d\n", numberOne, numberTwo, numberOne + numberTwo); 
	printf("%d - %d = %d\n", numberOne, numberTwo, numberOne - numberTwo);
	printf("%d * %d = %d\n", numberOne, numberTwo, numberOne * numberTwo);
	printf("%.f / %.f = %.1f", (float)numberOne, (float)numberTwo, (float)numberOne / (float)numberTwo);
	
	return 0;
} 
