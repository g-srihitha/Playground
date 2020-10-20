#include <iostream>

using namespace std;

int main()
{
int n;
  cin>>n;
  int a=1;
  for(int i=1;i<n+1;i++)
  {
  	if(i%2!=0){
	  
      for(int j=0;j<n;j++)
	  {
	  	if(j==n-1)
      cout<<a+1;
      else
      cout<<a;
      }}
      else
      {
      	for(int j=0;j<n;j++)
	  {
	  	if(j==0){
		  
      cout<<a+1;
     }
      else
      cout<<a;
	  }
	  }a++;
      cout<<"\n";
   
}

    return 0;

}