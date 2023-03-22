//This is used to include input/output header files.
#include <iostream>

//This is used to tell compiler that std:: namespace is used.
using namespace std;

//main function is the starting point of a C++ Program.
int main() {
  
  //int is a data-type which can hold integer data, n is the name of the variable used for storing data.
  
  //cin >> n is used to get user input from stdin tab.
  int n; cin >> n;
  
  //This is called nested-ternary operator which is used as replacement for if-else conditional statements.
  //Here (n > 0 ) is the first condition to be checked if we get true or 1 so after ? mark first statement which is "Positive" will execute
  //Otherwise second statement which is again a condition in this case (n < 0) will execute and again after ? mark first condition "Negative"
  //will print if it is true or 1 otherwise second statement "Neutral" will be printed.
  (n > 0 ) ? cout << "Positive" : (n < 0) ? cout << "Negative" : cout << "Neutral";
  
  //We can also use it like this for more readibility.
  //(n > 0 ) ? cout << "Positive" : (n < 0  ? cout << "Negative" : cout << "Neutral");
  
  //Used to tell that "No errors in the code".
  return 0;
  
}
