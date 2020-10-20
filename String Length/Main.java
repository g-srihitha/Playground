#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[100];
  int i;
  cin>>a;
  for(i=0;a[i] !='\0';i++);
  
    cout<<"The length of word "<<a<<" is "<<i;
}