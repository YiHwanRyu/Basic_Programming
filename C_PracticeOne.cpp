#include<stdio.h>
int main() {
	int number;
	printf("숫자입력 : ");
	scanf("%d", &number);
	if (number % 2 == 0) {
		printf("짝수입니다.");
	} else {
		printf("홀수입니다.");
	} 
	return 0;
}
