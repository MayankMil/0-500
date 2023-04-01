/********************************************************************* Question *****************************************************************************************/ 
/*

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
  */


  /********************************************************************* APPROACH *****************************************************************************************/ 
/*

- check if a string s is a rotation of goal is to concatenate s with itself and then check if goal is a substring of the concatenated string. 

- If s2 is a rotation of s1, then it will be present in the concatenated string. 

*/

/********************************************************************* Code *****************************************************************************************/ 


public static boolean isRotation(String s, String goal) {
    // Check if s and goal have different lengths
    if (s.length() != goal.length()) {
        // If they have different lengths, then goal cannot be a rotation of s
        return false;
    }
    // Concatenate s with itself to form a string that contains all possible rotations of s
    String concatenated = s + s;
    // Check if the concatenated string contains goal
    // If it does, then goal must be a rotation of s
    return concatenated.contains(goal);
}



/********************************************************************* Dry Run *****************************************************************************************/ 

/*

let's use the example of s = "abcde" and goal = "cdeab". We can create a table to show how the concatenated string is formed:

            i	      s.charAt(i)	          concatenated
            
            0	          a	                 abcdeabcde
            1     	    b	                 abcdeabcde
            2	          c	                 abcdeabcde
            3	          d	                 abcdeabcde
            4	          e	                 abcdeabcde
            5	          a	                 abcdeabcde
            6	          b	                 abcdeabcde
            7	          c	                 abcdeabcde
            8	          d	                 abcdeabcde
            9	          e	                 abcdeabcde
            
After concatenating s with itself, the resulting string is "abcdeabcde".
The code checks if this string contains the goal string "cdeab". Since "abcdeabcde" contains "cdeab", the function will return true.

Therefore, isRotation("abcde", "cdeab") will return true.

*/


