#include<iostream>
using namespace std;
int gcd(int a,int b){
  if(b!=0)
    return gcd(b,a%b);
  else
    return a;
}
  
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of ";
  cout << a <<" and " << b << " = " << gcd(a,b); 
  return 0;
  //Type your code here.
}