#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int l=0;
  int i,arr[n];
  for(i=0 ; i<n;i++){
    cin>>arr[i];
  if(arr[i]>l)
    l=arr[i];
  }
  cout<<l;
  
  
  
  
}