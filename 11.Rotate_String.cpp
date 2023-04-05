// We can easily see whether it is rotated if B can be found in (A + A).
// For example, with A = "abcde", B = "cdeab", we have

// “abcdeabcde” (A + A)
//   “cdeab” (B)
// B is found in (A + A), so B is a rotated string of A.

bool rotateString(string A, string B) {                
    return A.size() == B.size() && (A + A).find(B) != string::npos;
} 
