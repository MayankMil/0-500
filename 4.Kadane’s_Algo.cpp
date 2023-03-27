//This header file is used to include all libraries at once
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a[]={2, -4, 3, -1, 2};
  
  //This variable is used to store current iteration sub-array max sum.
    int local_max = 0;
  
  //This variable is used to store highest sub-array sum found.
    int global_max = INT_MIN;
  
  //Calculate size of an array
    int n=sizeof(a)/sizeof(a[0]);
    
  //Traversing
    for(int i = 0; i < n;i++)
	{   
      //finding local_max using max inbuilt function
	    local_max = max(a[i], a[i] + local_max);
        
     //finding highest max sub-array
	    if(local_max > global_max)
	    {
	        global_max = local_max; 
	    }
	    
	}
  
  //Printing Maximum Contiguous Sub_Array Sum.
	cout<<global_max;
	return 0;
}
