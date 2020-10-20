#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x1,y1,r1,x2,y2,r2,dist=0;
  cin>>x1>>y1>>r1>>x2>>y2>>r2;
  dist = sqrt(pow((x1-x2),2)+pow((y1-y2),2));
  if(dist ==(r1+r2))
  cout<<"Tangential";
  else if(dist < (r1+r2))
  cout<<"Overlap";
  else if ( dist >(r1+r2))
  cout<<"Do not Overlap";
  
}