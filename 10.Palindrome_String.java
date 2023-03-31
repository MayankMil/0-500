/*Given a string, determine if it is a palindrome. While checking for a palindrome, you have to ignore spaces, case, and all special characters; i.e. consider only alphanumeric characters.

Check the sample test case for reference.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Example Input
Input 1:
"A man, a plan, a canal: Panama"
Input 2:
"race a car"


Example Output
Output 1:
1
Output 2:
0


/*******************************************************************************code***********************************************************************************/


public class Solution {
    public int isPalindrome(String A) 
    {
        // Check if the string is null or empty. If so, it is considered a palindrome, so return true.
        if(A == null || A.isEmpty()) return 1;
        
        // Convert the string to lowercase and remove all non-alphanumeric characters
        A = A.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");// for detailed explaination of this line checkout below.
        
        // Initialize left and right pointers to the start and end of the string, respectively
        int left = 0, right = A.length()-1;
        
        // Continue checking characters from the left and right pointers inward until they meet in the middle
        while(left <= right) {
            // If the characters at the left and right pointers are not equal, the string is not a palindrome, so return false
            if(A.charAt(left) != A.charAt(right)) {
                return 0;
            }
            // Increment the left pointer and decrement the right pointer to continue checking inward
            left++;
            right--;
        }
      
        // If we've made it through the loop without finding any mismatched characters, the string is a palindrome, so return true
        return 1;
    } 
}


/*******************************************************************************Explaination***********************************************************************************/


/*A.toLowerCase() - It converts all the uppercase letters in the string A to lowercase.
.replaceAll("[^a-zA-Z0-9]", "") - This replaces any character in the string A that is not an alphabetic or numeric character with an empty string.
[^a-zA-Z0-9] matches any character that is not in the range of a to z, A to Z, or 0 to 9. This means that any spaces or special characters in the string will be removed.
  
 ^ - The caret symbol at the beginning of the regular expression means that we want to match any character that is NOT in the range specified by the expression.

a-zA-Z - This specifies the range of alphabetic characters from a to z (lowercase) and A to Z (uppercase). So, any character that is not in this range will be matched.

0-9 - This specifies the range of numeric characters from 0 to 9. So, any character that is not an alphabetic or numeric character will be matched.*/


/*******************************************************************************Dry Run***********************************************************************************/

/*
Line	   A	                           left	    right	    A.charAt(left)	    A.charAt(right)	    Return value
3	    "A man, a plan, a canal: Panama"	-	        -	            -	                   -	                -
4	      "amanaplanacanalpanama"       	0	        19	         'a'	                'a'	                -
9	      "amanaplanacanalpanama"	        1	        18	         'm'	                'm'	                -
9	      "amanaplanacanalpanama"	        2	        17	         'a'	                'a'	                -
9	      "amanaplanacanalpanama"	        3	        16	         'n'	                'n'	                -
9	      "amanaplanacanalpanama"	        4	        15	         'a'	                'a'	                -
9	      "amanaplanacanalpanama"	        5	        14	         'p'	                'p'	                -
9	      "amanaplanacanalpanama"	        6	        13	         'l'	                'l'	                -
9     	"amanaplanacanalpanama"	        7	        12	         'a'	                'a'	                -
9	      "amanaplanacanalpanama"	        8	        11	         'n'	                'n'	                -
9	      "amanaplanacanalpanama"	        9	        10	         'a'	                'a'	                -
10	    "amanaplanacanalpanama"	        -	         -	          -	                   -	                1
*/
