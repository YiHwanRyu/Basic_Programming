#include<stdio.h>
int main() {
	int year;
	printf("���ϴ� �⵵�� �Է��ϼ��� : ");
	scanf("%d", &year);
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		printf("�����Դϴ�.\n");
	} else {
		printf("������ �ƴմϴ�.\n");
	} 
	
	
	return 0;
}
