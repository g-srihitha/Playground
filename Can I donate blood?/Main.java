#include <iostream>
using namespace std;

int main() 
{
  int wt,age;
  cin>>age>>wt;
  if((age > 17) && (wt >= 50))
    cout<<"Eligible to donate blood:)";
  else
    cout<<"Not eligible to donate blood:(";
    return 0;
}