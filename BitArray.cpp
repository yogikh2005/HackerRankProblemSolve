#include <iostream>
#include <unordered_set>

using namespace std;

int main() {
    // Read input values
    long long S, P, Q, N;
    cin >> N >> S >> P >> Q;

    // Define modulo value as 2^31
    const long long MOD = 1LL << 31;

    // Use an unordered set to store distinct elements
    unordered_set<long long> distinct;

    // Initialize the first element of the sequence
    long long current = S % MOD;
    distinct.insert(current);

    // Generate the sequence and store distinct elements
    for (long long i = 1; i < N; ++i) {
        current = (current * P + Q) % MOD;
        distinct.insert(current);

        // Early exit if all distinct elements are found
        if (distinct.size() == N) {
            break;
        }
    }

    // Output the number of distinct elements
    cout << distinct.size() << endl;

    return 0;
}
