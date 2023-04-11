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
	printf("환전 결과\n");
	if (menuNumber == 1) {
		printf("달러 : %d달러\n", exchangeResult);
	} else if (menuNumber == 2) {
		printf("엔 : %d엔\n", exchangeResult);
	} else if (menuNumber == 3) {
		printf("유로 : %d유로\n", exchangeResult);
	} else if (menuNumber == 4) {
		printf("위안 : %d위안\n", exchangeResult);	
	} else if (menuNumber == 5) {
		printf("파운드 : %d파운드\n", exchangeResult);
	} 
	int changeResult1000 = changeResult / 1000;	
	int changeResult500 = (changeResult - changeResult1000 * 1000) / 500;
	int changeResult100 = (changeResult - changeResult1000 * 1000 - changeResult500 * 500) / 100;
	int changeResult50 = (changeResult - changeResult1000 * 1000 - changeResult500 * 500 - changeResult100 * 100) / 50;
	int changeResult10 = (changeResult - changeResult1000 * 1000 - changeResult500 * 500 - changeResult100 * 100 - changeResult50 * 50) / 10;
	printf("거스름돈 : total  %d원\n", changeResult);
	printf("           1000 * %d원\n", changeResult1000);
	printf("           500  * %d원\n", changeResult500);
	printf("           100  * %d원\n", changeResult100);
	printf("            50  * %d원\n", changeResult50);
	printf("            10  * %d원\n", changeResult10);
}

int main() {
	int moneyOfCustomer, menuChoice, exchangeResult;
	float exchangeRate, exchange, changeResult;
	printf("환전을 원하는 금액을 입력하세요(원화) : ");
	scanf("%d", &moneyOfCustomer);
	do {
		printf("환전할 외화를 선택하세요 (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuChoice);	
	} while (menuChoice < 1 || menuChoice > 5);
	exchangeRate = getExchangeRate(menuChoice); 
	printf("기준 환율 : %.2f\n", exchangeRate);
	exchange = moneyOfCustomer / exchangeRate;
	exchangeResult = (int)exchange;
	changeResult = (int)(moneyOfCustomer - exchangeResult * exchangeRate);
	changeResult = (int)(changeResult / 10) * 10;
	printExchangeResult(exchangeRate, menuChoice, exchangeResult, changeResult);
	return 0;
}

