#include<iostream>
int main()
{
  int n,p;
  std::cin>>n;
  do
  {
    n=n/10;
    p++;
  } while(n!=0);
  std::cout<<p;
}