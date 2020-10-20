#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int a[n],i,j,max=-1;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i] > max)
    {
      max = a[i];
    }
  }
  cout<<max;
}