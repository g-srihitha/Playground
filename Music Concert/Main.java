#include<iostream>
int main()
{
  int n,a[100];
  int o=0,e=0;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  if(a[i]%2==0)
  {
    e=e+1;
  }
    else
    {
      o=o+1;
    }
  }
  std::cout<<o<<"\n"<<e;
}
