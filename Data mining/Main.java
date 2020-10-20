#include<iostream>
int main()
{
	int n;
	int c=0,e=0,o=0;
	
	std::cin>>n;
	while (n>0)
	{
		c=n%10;
		if(c%2==0)
		{
			e=e+c;
		}else
		{
			o=o+c;
		}
		n=n/10;
	}
	if(e==o)
	{
		std::cout<<"Yes";
		
	}
	else
	{
		std::cout<<"No";
	}

	
}