#include <iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;
int main() 
{
  long long n;
  cin>>n;
  int e=0,o=0,i=0,diff=0;
  while(n!=0)
  {
    if(i%2==0)
    {
      e+=n%10;
      n/=10;
      i++;
    }
    else
    {
      o+=n%10;
      n/=10;
      i++;
    }
  }
  diff = abs(e-o);
  cout<<diff;
 }