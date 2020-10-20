#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int item;
  float time;
  cin>>item>>time;
  if(item == 1)
  {
    cout<<setprecision(2)<<time;
  }
  else if(item == 2)
  {
    cout<<setprecision(3)<<(time+(time/2));
  }
  else if(item==3)
  {
    cout<<setprecision(3)<<(2*time);
  }
  else 
  {
    cout<<"Number of items is more";
  }
}
