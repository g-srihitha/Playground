#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n,count,star=0;
  cin>>n;
  int i,j,lterm,rterm;
  lterm=1;//1st half 1st term
  rterm=n*n+1;//2nd half 1st term(10)
  for(i=n;i>0;i--)
  {
    for(count=1;count<=star;count++)
      cout<<"*";
    star+=2;
    //for 1st half
    for(j=1;j<=i;j++)
    {
      cout<<lterm<<"0";
      lterm++;
    }
    //for second half
    for(j=1;j<=i;j++)
    {
      cout<<rterm;
      if(j<i)
        cout<<"0";//for complete last term no 0
      rterm++;
    }
    rterm=rterm-(i-1)*2-1; //()2-1=
    cout<<endl;
  }
  return 0;
}