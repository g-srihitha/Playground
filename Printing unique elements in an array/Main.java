#include <iostream>
using namespace std;

int main() 
{
  int n,i,j,c=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    c=0;
    for(j=0;j<n;j++)
    {
      if(a[i] == a[j] && i!=j)
      {
        c=1;
        break;
      }
    }
    if(c==0)
    {
      cout<<a[i]<<" ";
    }
  }
    //return 0;
}