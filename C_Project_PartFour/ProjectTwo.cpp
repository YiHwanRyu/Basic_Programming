#include<stdio.h>

int plus(int a, int b);
int minus(int a, int b);
int mul(int a, int b);
float div(int a, int b);
void printA();
void printB();
void inputA(int *a);
void inputB(int *b);

int main() {
	int a, b;
	printA();
	inputA(&a);
	printB();
	inputB(&b);

	printf("plus : %d\n", plus(a, b));
	printf("minus : %d\n", minus(a, b));
	printf("multiply : %d\n", mul(a, b));
	printf("divide : %f\n", div(a, b));
	
	return 0;
}

int plus(int a, int b) {
    return a + b;
} 
int minus(int a, int b) {
    return a - b;
}
int mul(int a, int b) {
    return a * b;
}
float div(int a, int b) {
	return (float)a / (float)b;
}
void printA() {
	printf("Input first number : ");
}
void printB() {
	printf("Input second number : ");
}
void inputA(int *a) {
	int num;
	scanf("%d", &num);
	*a = num;
}
void inputB(int *b) {
	int num;
	scanf("%d", &num);
	*b = num;
}
