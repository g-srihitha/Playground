#include<iostream>
using namespace std;
#include<string.h>
int main()
{
   char s[30];
   int i,l,c=0;
  cin>>s;
  l=strlen(s);
  for(i=0;i<l;i++)
  {
    if(s[i] == 'a' ||s[i]=='e' ||s[i]== 'i' ||s[i]== 'o' ||s[i]== 'u'||s[i]=='A'||s[i]=='E' ||s[i]=='I'||s[i]=='O' ||s[i]=='U')
    {
      c++;
    }
  }
  cout<<"Number of vowels: "<<c;
    
    
}