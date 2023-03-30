// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

// Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

// You may assume that you have an infinite number of each kind of coin.

//Solution :

// Recursion
// Time: O(2^n)
// Space: O(n)

// Writing a recursive function is all about find two things:

// The base case: Just calculate the output for the smallest possible input

// The choice diagram: For any given input, just see what all choices do we have.





class Solution {
public:    
    int findLowestCoins(vector<int> &coins, int cur, int amount) {
        if (cur >= coins.size() || amount <= 0)
            return (amount == 0) ? 0 : INT_MAX - 1;   
        
        int res = -1;
        if (coins[cur] > amount) {
            int doNotTakeCoin = 0 + findLowestCoins(coins, cur + 1, amount - 0);
            res = doNotTakeCoin;
        }
        else {
            int takeCoin = 1 + findLowestCoins(coins, cur + 0, amount - coins[cur]);
            int doNotTakeCoin = 0 + findLowestCoins(coins, cur + 1, amount - 0);
            res = min(takeCoin, doNotTakeCoin);
        }
        return res;
    }
    
    int coinChange(vector<int>& coins, int amount) {
        int res = findLowestCoins(coins, 0, amount);
        return (res == INT_MAX - 1 ) ? -1 : res;
    }
};
