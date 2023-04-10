#include<stdio.h>
int IsMax(int imax, int in) {
	if (imax >= in) {
		return imax;
	} 
	return in;
}

int IsMin(int imin, int in) {
	if (imin >= in) {
		return in;
	} 
	return imin;
}

int main() {
	int A, B, C, D, E;
	printf("숫자 A입력 : ");
	scanf("%d", &A); 
	int max = A;
	int min = A;
	printf("숫자 B입력 : ");
	scanf("%d", &B);
	max = IsMax(max, B);
	min = IsMin(min, B);
	printf("숫자 C입력 : ");
	scanf("%d", &C); 
	max = IsMax(max, C);
	min = IsMin(min, C);
	printf("숫자 D입력 : ");
	scanf("%d", &D); 
	max = IsMax(max, D);
	min = IsMin(min, D);
	printf("숫자 E입력 : ");
	scanf("%d", &E);  
	max = IsMax(max, E);
	min = IsMin(min, E);
	printf("최대값은 %d 입니다.\n", max);
	printf("최저값은 %d 입니다.\n", min);
	return 0;
}
