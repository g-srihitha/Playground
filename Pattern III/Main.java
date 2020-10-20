#include <iostream>

using namespace std;

int main()
{
int n;
  cin>>n;
  int a=1;
  for(int i=1;i<n+1;i++)
  {
      for(int j=0;j<i;j++)
	  {
	  	if(j!=i-1)
      cout<<a<<"*";
      else
      cout<<a;
      }  a++;
      cout<<"\n";
   
}
a--;

	
	
	for(int i=0;i<n;i++){

      for(int j=n;j>i;j--){
      	if(j!=i+1)
      cout<<a<<"*";
      else
      cout<<a;
      
      }  a--;cout<<"\n";
    }
    return 0;

}