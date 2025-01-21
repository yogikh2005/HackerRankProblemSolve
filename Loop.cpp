#include <iostream>
#include <string>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    // Array to map numbers to their English representations
    string numbers[] = {"", "one", "two", "three", "four", "five", 
                        "six", "seven", "eight", "nine"};
    
    for (int i = a; i <= b; i++) {
        if (i >= 1 && i <= 9) {
            // Print English representation for numbers 1 through 9
            cout << numbers[i] << endl;
        } else if (i > 9 && i % 2 == 0) {
            // Print "even" for even numbers greater than 9
            cout << "even" << endl;
        } else {
            // Print "odd" for odd numbers greater than 9
            cout << "odd" << endl;
        }
    }

    return 0;
}
