#include <iostream>
using namespace std;

void subarray_with_given_sum(int arr[], int n, int sum) {
    int start = 0, end = 0, curr_sum = 0;

    while (end < n) {
        curr_sum += arr[end];

        while (curr_sum > sum && start < end) {
            curr_sum -= arr[start];
            start++;
        }

        if (curr_sum == sum) {
            cout << "Subarray with given sum found between indexes " << start << " and " << end << endl;
            return;
        }

        end++;
    }

    cout << "No subarray with given sum exists." << endl;
}

int main() {
    int n, sum;
    cout << "Enter the size of the array: ";
    cin >> n;

    int arr[n];
    cout << "Enter the array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Enter the sum to find: ";
    cin >> sum;

    subarray_with_given_sum(arr, n, sum);

    return 0;
}
