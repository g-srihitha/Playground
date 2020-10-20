#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int a[n],i,p,q,ip=-1,iq=-1;
 // cin>>p>>q;
  for(i=0;i<n;i++){
    cin>>a[i];}
  cin>>p>>q;
  for(i=0;i<n;i++){
  if(a[i]==p && ip==-1)
    ip = i;
  if(q == a[i] && iq==-1)
    iq = i;
  }
  cout<<"Element 1 index = "<<ip<<endl<<"Element 2 index = "<<iq;
}
 