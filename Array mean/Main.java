#include<iostream>
using namespace std;
int main()
{
  int a[20],sum=0,n,m=0,i;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    sum+=a[i];
  }
  m=sum/n;
  cout<<"The mean of the array is "<<m; 
}