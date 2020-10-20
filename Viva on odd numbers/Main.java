#include<iostream>
#include<iomanip>
using namespace std;
int main(){
  int n;
  float m=0.0;
  for(int i=0;i<3;)
  {
    cin>>n;
    if(n<0){
      m=m-1;
      break;}
    else if(n%2==0){
      m=m-0.5;}
    else {
      m=m+1;
      i++;}
  }
  cout<<m<<endl;
}
      
