#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,i,count=0;
  cin>>n;
  while(n!=0){
      sum+= n%10;
     n = n/10;}
 
  cout<<"Alice must go in path-"<<sum;


  
}