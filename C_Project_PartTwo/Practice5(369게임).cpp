#include<stdio.h>
#include<string>
#include<iostream>
#include<windows.h>
using namespace std;
int main() {
	// git encoding ���� 
	int putNumber;
	cout << "���� ����� �ұ��? ";
	cin >> putNumber;
	for (int i = 1; i <= putNumber; i++) {
		bool flag = false;
		string stringNumber = to_string(i);
		for (int j = 0; j < stringNumber.length(); j++) {
			Sleep(400);
			if (stringNumber[j] == '3' || stringNumber[j] == '6' || stringNumber[j] == '9') {
				cout << "¦";
				Beep(380, 70);
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
