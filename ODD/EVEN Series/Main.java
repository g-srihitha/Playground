#include <iostream>
using namespace std;
int main() 
{
  int a=0,t=0,n;
  cin>>n;
  if(n%2==1)
  {
    int a =0;
    t = a + (n-1)*2;
    cout<<t/2;
  }
  else
  {
    t = a + (n-1)*1;
    cout<<t/2;
  }
}