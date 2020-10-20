#include<iostream>
using namespace std;
int main()
{
  int l1,l2,l3;
  string l;
  cin>>l1>>l2>>l3>>l;
  if(l=="L1")
  {
    if(l2<l3)
      cout<<"L2";
    else
      cout<<"L3";
  }
  if(l=="L2")
  {
    if(l1<l3)
      cout<<"L1";
      else
        cout<<"L3";
  }
  if(l=="L3")
  {
    if(l1<l2)
      cout<<"L1";
    else
      cout<<"L2";
  }
}
