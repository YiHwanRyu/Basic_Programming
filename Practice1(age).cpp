#include<stdio.h>
#include<iostream>
#include<string>
#include<stdlib.h>
using namespace std;
int main() {
	const int YEAR = 2023;
	const int MONTH = 4;
	const int DAY = 11;
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
	
	if (MONTH < atoi(personNumber.substr(2, 2).c_str())) {
		age--;
	} else if(MONTH == atoi(personNumber.substr(2, 2).c_str()))  {
		if(DAY <= atoi(personNumber.substr(4, 2).c_str())) {
			age--;
		}
	}
	
	cout << "�� " <<  age << "��";
	return 0;
}
