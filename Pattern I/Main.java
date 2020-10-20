#include <iostream>

using namespace std;

int main()
{
int n;
  cin>>n;
  int a=1,a1=n+4,l=1;
  for(int i=0;i<4;i++)
  {
      for(int j=0;j<l;j++){
      cout<<n;
      
      }  n=n+1;l++;
      cout<<"\n";
   
}


 if(n==a1)
	{
		n=n-1;
		l--;
	}
	
	
	for(int i=0;i<4;i++){

      for(int j=l;j>0;j--){
      cout<<n;
      
      }  n-=1;  cout<<"\n";l--;
    }
    return 0;

}