#include<iostream>
int main()
{
	int n;
	int c=0;
	
	std::cin>>n;
std::cout<<n<<"\n";
	while(1)
	{
		
		if(n!=1){
		
		if(n%2==0)
		{
			n=n/2;
			c++;
		std::cout<<n<<"\n";
		}
		else
		{
			n=3*n+1;
			c++;
			std::cout<<n<<"\n";
		}
	}
	else
	{
		std::cout<<c<<"\n";
		return 0;
	}
	}
	
}
