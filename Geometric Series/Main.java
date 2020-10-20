#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,a=1,terms;
  cin>>n;
  if(n%2 == 1)
  {
    int r = 2;
    terms = (n+1)/2;
    cout<<a*pow(r,terms-1);
  }
  else
  {
    int r=3;
    terms = n/2;
    cout<<a*pow(r,terms-1);
  }
}
    