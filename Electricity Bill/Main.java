#include<iostream>
using namespace std;
int main()
{
  float x,p;
  int cost;
  cin>>x>>p>>cost;
  if(p<= 200){
     cost=x*(0.5);
     cout<<"Rs."<<cost;
  }
  else if(p<=400){
    cost=x*(0.65)+100;
    cout<<"Rs."<<cost;
    }
  else if(p<=600){
    cost=x*(0.80)+200;
    cout<<"Rs."<<cost;
    }
  else
    {
    cost=x*(1.25)+425;
    cout<<"Rs."<<cost;
    }
}
    