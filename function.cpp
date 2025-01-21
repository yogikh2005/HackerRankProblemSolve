#include <iostream>
#include <cstdio>
using namespace std;

// Function to return the maximum of four integers
int max_of_four(int a, int b, int c, int d) {
    int max_val = a; // Assume 'a' is the maximum initially
    if (b > max_val) max_val = b;
    if (c > max_val) max_val = c;
    if (d > max_val) max_val = d;
    return max_val;
}

int main() {
    int a, b, c, d;
    // Reading four integers
    scanf("%d %d %d %d", &a, &b, &c, &d);
    // Calling the function to find the maximum
    int ans = max_of_four(a, b, c, d);
    // Printing the result
    printf("%d", ans);
    
    return 0;
}
