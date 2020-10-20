#include <iostream>
using namespace std;
int minproduct(long int a[],long int b[],long int n,long int k)
{
  long int pro,res=0;
  long int i,temp=0,d,diff=0;
  for(i=0;i<n;i++)
  {
    pro=a[i]*b[i];
    res+=pro;
    if(pro<0 && b[i]<0)
      temp=(a[i]+2*k)*b[i];
    else if(pro<0 && a[i]<0)
      temp=(a[i]-2*k)*b[i];
     else if(pro>0 && a[i]<0)
      temp=(a[i]+2*k)*b[i];
     else if(pro>0 && a[i]>0)
      temp=(a[i]-2*k)*b[i];
    d=abs(pro-temp);
    if(d>diff)
      diff=d;
  }
  return res-diff;
}
int main() 
{
   long int n,k;
  long int i;
   cin>>n>>k;
  long int a[n],b[n];
  for(i=0;i<n;i++)
    cin>>a[i];
   for(i=0;i<n;i++)
    cin>>b[i];
  cout<<minproduct(a,b,n,k);
    return 0;
}