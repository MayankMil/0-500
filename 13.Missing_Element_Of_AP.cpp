//Back-end complete function template for C++

class Solution{   
public:
    // A binary search based recursive function that returns
    // the missing element in arithmetic progression
    int findMissingUtil(int arr[], int low, int high, int diff) {
        if (high <= low) 
            return INT_MAX;

        int mid = low + (high - low) / 2;

        // The element just after the middle element is missing.
        // The arr[mid+1] must exist, because we return when
        // (low == high) and take floor of (high-low)/2
        if (arr[mid + 1] - arr[mid] != diff) return (arr[mid] + diff);

        // The element just before mid is missing
        if (mid > 0 && arr[mid] - arr[mid - 1] != diff)
            return (arr[mid - 1] + diff);

        // If the elements till mid follow AP, then recur
        // for right half
        if (arr[mid] == arr[0] + mid * diff)
            return findMissingUtil(arr, mid + 1, high, diff);

        // Else recur for left half
        return findMissingUtil(arr, low, mid - 1, diff);
    }

    int findMissing(int arr[], int n) {
        int diff = (arr[n - 1] - arr[0]) / n;
        return findMissingUtil(arr, 0, n - 1, diff);
    }
};
      
