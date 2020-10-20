#include<iostream>
using namespace std;
int main()
{
	int n,p,q,r;
	cin>>n;
	p=(n-4)/5;
	n=n-(p*5);
	if(n%2==0)
		q=2;
	else
		q=1;
	r= (n-q)/2;
	cout<<p+r+q<<" "<<p<<" "<<r<<" "<<q;
}