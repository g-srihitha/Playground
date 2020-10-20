#include<iostream>
using namespace std;
int main()
{
  int a,b,p;
  cin>>a>>b>>p;
  cout<<"Enter first number :";
  cin>>a;
  cout<<" Enter second number :";
  cin>>b;
  cout<<" Menu \n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
  switch(p){
    case 1:cout<<(a+b)<<endl;break;
    case 2:cout<<(a-b)<<"\n";break;
    case 3:cout<<(a*b)<<"\n";break;
    case 4:cout<<(a/b)<<"\n";break;
    case 5:cout<<(a%b)<<"\n";break;
    default:cout<<"Invalid operation";
  }
}
