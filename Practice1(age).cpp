#include<stdio.h>
#include<iostream>
#include<string>
#include<stdlib.h>
#include<time.h>
using namespace std;
int main() {
	time_t timeNow;
	struct tm* timeNowChange;
	timeNow = time(NULL);
	timeNowChange = localtime(&timeNow);
	int year = timeNowChange -> tm_year + 1900;
	int month = timeNowChange -> tm_mon + 1;
	int day = timeNowChange -> tm_mday;
	int age;
	string ageRaw = "";
	string personNumber = "";
	printf("�ֹε�Ϲ�ȣ�� ���ӵ� ���ڷ� �Է��ϼ��� : ");
	cin >> personNumber;
	
	if (personNumber.length() != 13) {
		printf("�߸��Է��ϼ̽��ϴ�. �ٽ� �����ϼ���.\n");
		return 0;
	}
	if (personNumber.substr(6, 1) == "3" || personNumber.substr(6, 1) == "4") {
		age = 23 - atoi(personNumber.substr(0, 2).c_str());
	} else {
		ageRaw = "19" + personNumber.substr(0, 2);
		age = 2023 - atoi(ageRaw.c_str());
	}
	
	if (month < atoi(personNumber.substr(2, 2).c_str())) {
		age--;
	} else if(month == atoi(personNumber.substr(2, 2).c_str()))  {
		if(day <= atoi(personNumber.substr(4, 2).c_str())) {
			age--;
		}
	}
	
	cout << "�� " <<  age << "��";
	return 0;
}
