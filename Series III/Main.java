#include<iostream>
#include<cmath> // For using pow(base,exponent) function
using namespace std;
int main()
{
  int n,i,p;
  cin>>n;
  //p=3; //intial valu in the series is 3
  for(i=1;i<=n;i++)
  {
    p=pow(3,i);
    cout<<p<<" ";
  }
}