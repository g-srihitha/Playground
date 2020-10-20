#include<iostream>
using namespace std;
long long int f(long int n){
  long long int i;
  long long int f[n];
  f[1]=0;f[2]=1;
  for(i=3;i<=n;i++)
    f[i]=((i-1)*(f[i-2]+f[i-1]))%100000007; 
  return f[n];
}
int main()
{
long long int n;
 cin>>n;
  if(n>=1 && n<=1000000)
    cout<<f(n);
  return 0;
}