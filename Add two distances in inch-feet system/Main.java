#include<iostream>
using namespace std;
struct distance
{
  int feet;
  float inch;
}
d1,d2,sum;
int main()
{
  cin>>d1.feet;
  cin>>d1.inch;
  cin>>d2.feet;
  cin>>d2.inch;
  sum.feet=d1.feet+d2.feet;
  sum.inch=d1.inch+d2.inch;
 if(sum.inch>12){
    sum.inch-=12;
    ++sum.feet;
 }
  cout<<sum.feet<<"'"<<"-"<<sum.inch<<'"';
}