#include<iostream>
using namespace std;
int main(){
  int n=0,days,cycle=50;
  float sqroot=1;
  cin>>n;
  while(cycle>0) {
    sqroot=(sqroot +(n/sqroot))/2;
    --cycle;}
  days=n+(int(sqroot)+1);
  cout<<int(days);}