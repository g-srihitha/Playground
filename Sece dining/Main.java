#include<iostream>
using namespace std;
int main()
{
  char a[10];
  int r;
  cin>>a>>r;
  if (a[0]=='f'){
    if(r==1){
 cout<<"Left Handed";
    }else{cout<<"Right Handed";}
  }else{
    if(r==1){
      cout<<"Right Handed";
     }else{cout<<"Left Handed";}
  }
}