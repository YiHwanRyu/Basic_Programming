#include<stdio.h>
int main() {
	int A, B;
	printf("숫자 A입력 : ");
	scanf("%d", &A); 
	printf("숫자 B입력 : ");
	scanf("%d", &B); 
	if (A > B) {
		printf("큰 숫자는 %d 입니다." , A);
	} else if (A == B) {
		printf("A와 B가 동일합니다.");
	} else {
		printf("큰 숫자는 %d 입니다." , B);
	} 
	return 0;
} 
