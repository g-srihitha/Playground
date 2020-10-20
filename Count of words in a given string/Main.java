#include <iostream>
#include<stdio.h>
using namespace std;

int main() 
{
  char s[100];
  scanf("%[^\n]", s);
  int i,c=0;
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
      c++;
  }
  c+=1;
  cout<<c;
}