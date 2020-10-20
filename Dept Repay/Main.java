#include<iostream>
using namespace std;
int main()
{
  int pa,ri,y;
  double m,i,d,fs;
  cin>>pa>>ri>>y;
  i=(pa*ri*y)/100;
  cout<<i<<"\n";
  m=i+pa;
  cout<<m<<"\n";
  d=i*2/100;
  cout<<d;
  cout<<endl;
  fs=m-d;
  cout<<fs;
}