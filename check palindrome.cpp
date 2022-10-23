bool isPalindrome(string &str)
{
int first=0;int end=str.length()-1;
  while(first<end)
    if(str[end]!=str[first])
     return false;
     first++;
     end--;
}
  return true;
}
  
