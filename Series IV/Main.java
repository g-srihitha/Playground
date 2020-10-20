#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  float i,j;
  int n;
  cin>>n;
  j=0.5;
  for(i=0;i<n;i++)
  {
    cout<<j<<" "; 
    j=j+pow(3,i);
   // cout<<j<<" ";
 
  }
}