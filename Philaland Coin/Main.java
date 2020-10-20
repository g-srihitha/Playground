# include<iostream>
using namespace std;
int main(){
  int t;
  cin>> t ;
  for ( int i = 0; i<t; i++)
  {
    int n;
    int count = 0;
    cin>>n;
    while ( n >  0)
    {
      count++;
      n = n/ 2 ;}
    cout<<count<<endl;
  }
}
    
    