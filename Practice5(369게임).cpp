#include<stdio.h>
#include<string>
#include<iostream>
using namespace std;
int main() {
	int putNumber;
	cout << "���� ����� �ұ��? ";
	cin >> putNumber;
	for (int i = 1; i <= putNumber; i++) {
		bool flag = false;
		string stringNumber = to_string(i);
		for (int j = 0; j < stringNumber.length(); j++) {
			if (stringNumber[j] == '3' || stringNumber[j] == '6' || stringNumber[j] == '9') {
				cout << "¦";
				flag = true;
			}
		}
		if (!flag) {
			cout << stringNumber;
		}
		cout << "\n";
	}
	return 0;
}
