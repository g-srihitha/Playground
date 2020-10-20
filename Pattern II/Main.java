#include <iostream>

using namespace std;

int main()
{
int n,a=1;
cin>>n;
for(int i=1;i<n+1;i++)
{
	if(i%2!=0)
	for(int j=1;j<=i;j++)
	{
		if(j!=i)
	cout<<a++<<"*";	
	else
	cout<<a++;
	}
	else
	{
		a=a+i;
	for(int l=i;l>=1;l--)
	{
		if(l!=1)
		cout<<--a<<"*";
		else
		cout<<--a;
	}
	a=a+i;	
	}
	cout<<"\n";
}
    return 0;

}