#include <iostream>
int main() 
{
  int n,r=0,re;
 std::cin>>n;
  while(n!=0)
  {
    re=n%10;
    r=r*10+re;
    n/= 10;}
  std:: cout<<r;
}