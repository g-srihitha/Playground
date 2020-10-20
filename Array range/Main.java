#include<iostream>
using namespace std;
int main()
{
  int a[20],i,max,min,n,r;
  cout<<"Enter the number of elements in the array"<<'\n';
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>a[i];
  max=a[0];
  for(i=0;i<n;i++)
  {
    if(max<a[i])
    {
      max=a[i]; }}
   min=a[0];
   for(i=0;i<n;i++)
   {
     if(min>a[i]){
       min=a[i];}
   }
    r=max-min;
    cout<<"The range of the array is "<<r;
   }
