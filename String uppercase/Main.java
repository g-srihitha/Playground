#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[50];
  int i;
  cin>>s;
  for(i=0;i<=strlen(s);i++)
  {
    if(s[i]>=97 && s[i]<=122)
    {
      s[i]=s[i]-32;
    }
  }
    cout<<"String in uppercase is "<<s;

}