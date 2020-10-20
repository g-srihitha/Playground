#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[30];
  cin>>s;
  int i;
  for(i=0;i<=strlen(s);i++)
  {
    if(s[i]>=65 && s[i]<=90)
    {
      s[i]=s[i]+32;
    }
  }
  cout<<"String in lowercase is "<<s;
}