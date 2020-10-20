#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d,q;
  cin>>m>>p>>d;
  q=m*p;
  if(q>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  
}