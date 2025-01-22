#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n; // Number of integers
    cin >> n;

    vector<int> arr(n); // Declare a vector to store the integers

    // Input the integers into the array
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Print the integers in reverse order
    for (int i = n - 1; i >= 0; i--) {
        cout << arr[i];
        if (i > 0) cout << " "; // Add a space after each number except the last
    }

    return 0;
}
