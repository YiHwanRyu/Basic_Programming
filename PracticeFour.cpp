#include<stdio.h>
#include<string>
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<string> solution (int n, vector<int> arr1, vector<int> arr2) {
	vector<string> answer;
	for (int i = 0; i < n; i++) {
		arr1[i] |= arr2[i];
	}
	
	for (int i = 0; i < n; i++) {
		string ret = "";
		for (int j = 0; j < n; j++) {
			if (arr1[i] & (1 << j)) {
				ret += "#";
			} else {
				ret += " ";
			}
		}
		reverse(ret.begin(), ret.end());
		answer.push_back(ret);
	}
	return answer;
}

int main() {
	vector<string> answerMain = solution(5, {9, 20, 28, 18, 11}, {30, 1, 21, 17, 28});
	vector<string> answerMain2 = solution(6, {46, 33, 33, 22, 31, 50}, {27, 56, 19, 14, 14, 10});
	cout << "Example1 " << "\n";
	for (string str : answerMain){
		cout << "\"" << str << "\"" << "\n"; 
	}
	cout << "Example2 " << "\n";
	for (string str : answerMain2){
		cout << "\"" << str << "\"" << "\n"; 
	}
	return 0;
}
//source: https://school.programmers.co.kr/learn/challenges
