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
	printf("���� A�Է� : ");
	scanf("%d", &A); 
	int max = A;
	int min = A;
	printf("���� B�Է� : ");
	scanf("%d", &B);
	max = IsMax(max, B);
	min = IsMin(min, B);
	printf("���� C�Է� : ");
	scanf("%d", &C); 
	max = IsMax(max, C);
	min = IsMin(min, C);
	printf("���� D�Է� : ");
	scanf("%d", &D); 
	max = IsMax(max, D);
	min = IsMin(min, D);
	printf("���� E�Է� : ");
	scanf("%d", &E);  
	max = IsMax(max, E);
	min = IsMin(min, E);
	printf("�ִ밪�� %d �Դϴ�.\n", max);
	printf("�������� %d �Դϴ�.\n", min);
	return 0;
}
