#include <stdio.h>

int main(int argc, char *argv[]) {
	int  desc = 38;
	int base = 2;
	while(desc > 1) {
		base = getFirstDivisor(desc, base);
		printf("%d | %d\n", desc, base);
		desc /= base;
	}
	printf("1 | ");
	return 0;
}

int getFirstPrime(int from) {
	int i;
	for (i = from; i < 1000000; i ++) {
		if (isPrime(i)) {
			/*printf("Returning from getFirstPrime from %d => %d ", from, i);*/
			return i;
		}
	}
	printf("Cant get any prime");
	return -1;
}

int isPrime(int n) {
	int i;
	
	if (n == 1 || n == 2) {
		return 1;
	}
	
	for (i = n - 1; i >= 2; i--) {
		if (n % i == 0) {
			return 0;
		}
	}
	return 1;
}

int getFirstDivisor(int num, int base) {
	
	/*printf("getFirstDivisor  %d, %d ", num, base);*/
	if (base == num) {
		return base;
	}
		
	if(num % base == 0) {
		return base;
	}
	
	return getFirstDivisor(num, getFirstPrime(base + 1));
	
}
