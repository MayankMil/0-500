
#include <iostream>

using namespace std;

int main() {
  
  int n; cin >> n;
  
  (n > 0 ) ? cout << "Positive" : (n == 0) ? cout << "Neutral" : cout << "Negative";
  
  return 0;
  
}
