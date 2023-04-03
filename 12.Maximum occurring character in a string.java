/********************************** Question *********************************/
/*
Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 
Examples:
Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them
Example 2:
Input: str = “apple”
Output: p
Explanation: The character 'p' have the maximum occurrence i.e 2.
*/

/********************************** Approach *********************************/

Approach 1: TC = O(n2) , SC = O(1);
/*
here's a brief summary of the approach in just 3 points:
Initialize a count variable to 0 and loop through each character in the string.
For each character, loop through the string again and count how many times it occurs.
Update the maximum count and corresponding character if the current count is greater than the previous maximum.
*/

Approach 2: TC = O(n) , SC = O(n);

/*
we can optimize the approach using a HashMap data structure. Here's how we can do it:
- Create an empty HashMap to store the characters and their corresponding counts.
- Loop through each character in the string and check if it exists in the HashMap.
- If it does not exist, add it to the HashMap with a count of 1. If it already exists, increment its count.
- After looping through all the characters, loop through the HashMap to find the character with the maximum count.
- Return the character with the maximum count.
*/


Approach 3: TC = O(n) , SC = O(1);

/*
- Create an integer array of size 256 to store the count of each character in the string. The size of the array is 256 because that's the total number of possible ASCII characters.
- Loop through each character in the string and increment the count of that character in the array.
- Keep track of the character with the highest count so far and update it as you loop through the string.
- Return the character with the highest count.
- The character with the highest count is the maximum occurring character in the string.
*/

/********************************** Code *********************************/

//Approach 1:

public static char getMaxOccurringChar(String str) {
    int maxCount = 0;
    char maxChar = ' ';
    
    for (int i = 0; i < str.length(); i++) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxChar = str.charAt(i);
        }
    }
    return maxChar;
}


........................................................................................................................................................................

//Approach 2:

public static char getMaxOccurringChar(String str) 
{
    Map<Character, Integer> charCountMap = new HashMap<>();
    
      // Loop through each character in the string and add it to the HashMap
    for (char c : str.toCharArray()) {
        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }
    
      // Loop through the HashMap to find the character with the maximum count
    char maxChar = ' ';
    int maxCount = 0;
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) // in simple terms, the line is saying "for each key-value pair (or entry) in the charCountMap, do the following...".
    {
        if (entry.getValue() > maxCount) {
            maxChar = entry.getKey();
            maxCount = entry.getValue();
        }
    }
    
    return maxChar;
}

........................................................................................................................................................................

  
//Approach 3:

public class Main {
   static char maxOccurringChar(String str) {
      char ans = 'a'; // Initialize the answer as 'a'
      int maxfreq = 0, n = str.length(); // Initialize the maximum frequency and length of the string
      int count[] = new int[256]; // Create an array to count the occurrences of each character
      for (int i = 0; i < n; i++) { // Loop through each character in the string
         count[str.charAt(i)]++; // Increment the count for the current character
         if (count[str.charAt(i)] > maxfreq) { // If the count for the current character is greater than the maximum frequency so far
            maxfreq = count[str.charAt(i)]; // Update the maximum frequency
            ans = str.charAt(i); // Update the answer to be the current character
         }
      }
      return ans; // Return the character with the highest frequency
   }
}




/********************************** Dry Run *********************************/


/*
i	    Character	    count[str.charAt(i)]	    maxfreq	    ans	    count array
0	    'a'	                1	                    1	        'a'	    [0, 0, ..., 0, 1, 0, ..., 0]
1	    'p'               	1	                    1	        'a'	    [0, 0, ..., 0, 1, 0, 1, ..., 0]
2	    'p'	                2	                    2	        'p'	    [0, 0, ..., 0, 1, 0, 2, ..., 0]
3	    'l'	                1	                    2	        'p'	    [0, 0, ..., 0, 1, 0, 2, ..., 1]
4	    'e'	                1	                    2	        'p'	    [0, 0, ..., 1, 1, 0, 2, ..., 1]
*/
