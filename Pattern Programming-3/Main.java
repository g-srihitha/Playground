#include <iostream>
using namespace std;

int main() 
{
  int r,c,n,p=1;
  cin>>n;
  for(r=1;r<=n;r++)
  {
    for(c=1;c<=r;c++)
    {
      cout<<p<<" ";
      p++;
    }
    cout<<endl;
  }
}