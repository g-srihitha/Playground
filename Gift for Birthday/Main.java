#include<iostream>
using namespace std;
int main()
{
  int p;
  cin>>p;
  if((p%4==0)&&(p%100!=0))
    cout<<p<<" is a leap year";
  else
    cout<<p<<" is not a leap year";
}