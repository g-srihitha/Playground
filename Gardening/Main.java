#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if(r<t&&t<=2*r||(c-2)*r<t&&t<=(c-1)*r)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}