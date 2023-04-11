#include<stdio.h>
const float USD = 1320.00, JPY = 995.66, EUR = 1438.80, CNY = 191.91, GBP = 1637.59; 
float getExchangeRate(int mode) {
	if (mode == 1) {
		return USD;	
	} else if (mode == 2) {
		return JPY;
	} else if (mode == 3) {
		return EUR;
	} else if (mode == 4) {
		return CNY;
	} else if (mode == 5) {
		return GBP;
	} 
}
void printExchangeResult (float exchangeRate, int menuNumber, int exchangeResult, int changeResult) {
	printf("ȯ�� ���\n");
	if (menuNumber == 1) {
		printf("�޷� : %d�޷�\n", exchangeResult);
	} else if (menuNumber == 2) {
		printf("�� : %d��\n", exchangeResult);
	} else if (menuNumber == 3) {
		printf("���� : %d����\n", exchangeResult);
	} else if (menuNumber == 4) {
		printf("���� : %d����\n", exchangeResult);	
	} else if (menuNumber == 5) {
		printf("�Ŀ�� : %d�Ŀ��\n", exchangeResult);
	} 
	int remainResult;
	int changeResult1000 = changeResult / 1000;
	remainResult = changeResult % 1000;	
	int changeResult500 = remainResult / 500;
	remainResult = remainResult % 500;
	int changeResult100 = remainResult / 100;
	remainResult =  remainResult % 100;
	int changeResult50 = remainResult / 50;
	remainResult =  remainResult % 50;
	int changeResult10 = remainResult / 10;
	remainResult =  remainResult % 10;
	printf("�Ž����� :    %d��\n", changeResult);
	printf("      1000  * %3d��\n", changeResult1000);
	printf("       500  * %3d��\n", changeResult500);
	printf("       100  * %3d��\n", changeResult100);
	printf("        50  * %3d��\n", changeResult50);
	printf("        10  * %3d��\n", changeResult10);
}

int main() {
	int moneyOfCustomer, menuChoice, exchangeResult;
	float exchangeRate, exchange, changeResult;
	printf("ȯ���� ���ϴ� �ݾ��� �Է��ϼ���(��ȭ) : ");
	scanf("%d", &moneyOfCustomer);
	do {
		printf("ȯ���� ��ȭ�� �����ϼ��� (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuChoice);	
	} while (menuChoice < 1 || menuChoice > 5);
	exchangeRate = getExchangeRate(menuChoice); 
	printf("���� ȯ�� : %.2f\n", exchangeRate);
	exchange = moneyOfCustomer / exchangeRate;
	exchangeResult = (int)exchange;
	changeResult = (int)(moneyOfCustomer - exchangeResult * exchangeRate);
	changeResult = (int)(changeResult / 10) * 10;
	printExchangeResult(exchangeRate, menuChoice, exchangeResult, changeResult);
	return 0;
}

