#include<iostream>
using namespace std;
int main(){
  int n,p,div,i,sum=0,s=0;
  cin>>n>>p;
  s=n+p;
  for(i=1;i<s;i++)
  {
    div=s%i;
    if(div==0)
      sum=sum+i;
  }
  if(sum==s)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}