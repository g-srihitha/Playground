#include <iostream>
using namespace std;

int main() 
{
  int a[15],n,i,sum=0,dum=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      dum+=a[i];
    }
  
    else
    {
      sum+=a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<dum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum;
}

