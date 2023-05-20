#include<stdio.h>
//int square[1000][1000];
int main() {
	int number;
	printf("Input : ");
	scanf("%d", &number);
	int square[number][number];
	int y = 0, x = 0;
	int count = 0;
	//5 9 13 16 19 21 23 24
	for (int i = 0; i < number; i++) {
		count++;
		y = i / number;
		x = i % number;
		square[y][x] = count;
		//printf("y: %d, x: %d, square[y][x]: %d\n", y, x, square[y][x]);
	}
	int flag = 1;
	int k = 1;
	int flagtwo = 1;
	int turnInt = number - k;
	for (int i = number; i < number * number; i++) {
		//printf("y: %d, x: %d, square[y][x]: %d\n", y, x, square[y][x]);
		count++;
		if (flag == 0) {
			x += 1;
		} else if (flag == 1) {
			y += 1;
		} else if (flag == 2) {
			x -= 1;
		} else {
			y -= 1;
		}
		turnInt -= 1;
		square[y][x] = count;
		if (turnInt == 0 && flagtwo == 2) {
			flag = (flag + 1) % 4;
			flagtwo = 1;
			k++;
			turnInt = number - k;
		} else if (turnInt == 0 && flagtwo == 1) {
			flag = (flag + 1) % 4;
			flagtwo++;
			turnInt = number - k;
		}
	}

	for (int i = 0; i < number; i++) {
		for (int j = 0; j < number; j++) {
			printf("%-3d", square[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
