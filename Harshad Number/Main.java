#include<iostream>
using namespace std;
int main()
{
  int n,temp;
  cin>>n;
  int s=0;
  temp=n;
  while(temp)
  {
    s +=temp % 10;
    temp= temp/10;
  }
  int r=n%s;
  if(r==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
}