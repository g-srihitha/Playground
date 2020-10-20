#include<iostream>
using namespace std;
int power(int a,int n){
  if(n==0)
    return 1;
  else
    return (a*power(a,n-1));
}
int main()
{
  int a,n;
  cin>>a>>n;
  std::cout<<"Enter the value of a"<<"\n";
  std::cout<<"Enter the value of n"<<"\n";
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
  return 0;
}