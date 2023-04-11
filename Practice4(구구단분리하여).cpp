#include<stdio.h>
int main() {
	int number, inputNumber, wantNumber;
	printf("한줄에 몇개? : ");
	scanf("%d", &inputNumber); 
	for (int number = 2; number < 10; number += inputNumber) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < inputNumber; j++) {
				printf("%d x %d = %d\t", number + j, i, (number + j) * i);
			}
			printf("\n");
		} 
		printf("\n");
	}
	return 0;
} 
