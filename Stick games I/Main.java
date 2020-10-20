#include<iostream>
using namespace std;
int main()
{
  int n,m,g;
  cin>>n>>m;
  if(n<m)
    g=n;
  else
    g=m;
  if(g%2==0)
    cout<<"Jaime Lannister";
  else
    cout<<"Tyrion Lannister";
}