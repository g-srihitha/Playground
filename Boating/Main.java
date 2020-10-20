#include<iostream>
using namespace std;
int main()
{
  int a,b,c,p;
  cin>>a>>b>>c;
  p=(b*75)+(c*30);
  if(p<=a){
    cout<<"Boat is stable";
     }
    else{
     cout<<"Boat will drow";
    }
}