#include<iostream>
using namespace std;
#include<string.h>
int main()
{
  char s[30];
  int i,l,p;
  cin>>s;
  l=strlen(s);
  for(i=0;i<l;i++)
  {
    if(s[i]!=s[l-i-1])
    {
      p=1;
      break;
    }
  }
  if(p)
    cout<<"Not a Palindrome";
  else
    cout<<"Palindrome";
}