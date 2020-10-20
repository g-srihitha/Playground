#include<iostream>
using namespace std;
int main()
{
  int f,n,i;
  cin>>n;
  f=6;
 
    for(i=1;i<=n;i++)
    {
      cout<<f<<" ";
      f+=(5*i);
    }
}