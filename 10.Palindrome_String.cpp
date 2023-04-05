bool ispalindrome(string str)
{
    int i=0, j=str.size()-1;
    while(i<j)
    {
        if(str[i]!=str[j])
            return false;
        i++;
        j--;
    }
    return true;
}

int Solution::isPalindrome(string A) {
    string str="";
    for(int i=0;i<A.size();i++)
    {
        if(isalpha(A[i]))
        {
            str+=A[i];
        }
        else if(isdigit(A[i]))
        {
            str+=A[i];
        }
    }
    for(int i=0;i<str.size();i++)
    {
        str[i] = tolower(str[i]);
    }
    if(ispalindrome(str) == true)
    {
        return 1;
    }
    else    
        return 0;
}
