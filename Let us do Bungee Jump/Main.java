#include <iostream>
using namespace std;

int main() 
{
  int age,wt;
  cin>>age>>wt;
  if(age >= 12) {
    if ( (wt >=40) && (wt<=110))
    cout<<"He can Jump";}
  if((age >= 12) && (wt>110))
    cout<<"Extra ropes will be added";
  if(age<12)
    cout<<"He can't Jump";
    return 0;
}