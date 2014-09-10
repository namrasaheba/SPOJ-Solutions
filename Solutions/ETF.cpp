#include <iostream>
using namespace std;
int generateEulerTotient(int n) {
    int result = n;
    for (int i = 2; i * i <= n; i++) { // Loop till the square-root of the number
        if (n % i == 0) { // If number is divisible by the factor
            result -= result / i;
        }
        while (n % i == 0) {
            n /= i;
        }
    }
    if (n > 1) {
        result -= result / n;
    }
    return result;
}
 
int main() {
	int testCases, n;
 
	cin >> testCases;
	while ( testCases > 0 ) {
		cin >> n;
		int result = generateEulerTotient(n);
		cout << result << "\n";
		testCases--;
	}
 
	return 0;
}


