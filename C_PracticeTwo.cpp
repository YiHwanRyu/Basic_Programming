#include<stdio.h>
int main() {
	int A, B;
	printf("���� A�Է� : ");
	scanf("%d", &A); 
	printf("���� B�Է� : ");
	scanf("%d", &B); 
	if (A > B) {
		printf("ū ���ڴ� %d �Դϴ�." , A);
	} else if (A == B) {
		printf("A�� B�� �����մϴ�.");
	} else {
		printf("ū ���ڴ� %d �Դϴ�." , B);
	} 
	return 0;
} 
