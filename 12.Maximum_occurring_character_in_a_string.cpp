// Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 

// Examples:

// Example 1:
// Input: str = “takeuforward”
// Output: a
// Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

// Example 2:
// Input: str = “apple”
// Output: p
// Explanation: The character 'p' have the maximum occurrence i.e 2.

#include <iostream>
#include <algorithm>
using namespace std;
//Function to find Maximum Occurring Character
char maxOccurringChar(string str) {
   char ans = str[0];
   int i, curr_freq = 0, max_freq = 0, n = str.length();
   for (i = 0; i < n; i++) {
      if (str[i] == str[i - 1]) {
         curr_freq++;
      } 
      else {
         if (max_freq < curr_freq) {
            max_freq = curr_freq;
            ans = str[i - 1];
         }
         curr_freq = 0;
      }
   }
   if (max_freq < curr_freq) {
      max_freq = curr_freq;
      ans = str[i - 1];
   }
   return ans;
}
int main() {
   string str = "takeuforward";
   //sort the string
   sort(str.begin(), str.end());
   cout <<  "Maximum Occurring Character is " << maxOccurringChar(str);
}
