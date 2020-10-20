#include<iostream>
using namespace std;
int main()
{
  int x,y,z,rem1;
  cin>>x>>y>>z;
  rem1=z%y;
  if(z>=1 && z<=y){
    cout<<"Yes";
  }
  else if(rem1==0){
    cout<<"Yes";}
  else if(rem1==1){
    cout<<"Yes";}
  else{
    cout<<"No";
  }
}
