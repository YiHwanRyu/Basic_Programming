#include<stdio.h>
int main() {
	// git encoding 수정 
	int number, inputNumber, wantNumber;
	bool eraseSpace = false;
	printf("한줄에 몇개? : ");
	scanf("%d", &inputNumber); 
	printf("몇단까지? : ");
	scanf("%d", &wantNumber); 
	for (int number = 2; number < 10; number += inputNumber) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < inputNumber; j++) {
				if (number + j > wantNumber) {
					eraseSpace = true;
					break;
				}
				printf("%d x %d = %d\t", number + j, i, (number + j) * i);
			}
			printf("\n");
		} 
		if (eraseSpace) {
			break;
		}
		printf("\n");
	}
	return 0;
} 
