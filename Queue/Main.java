#include <iostream>
using namespace std;
int main()
{
    int a[10],count=0,i,n,m;
    cin>>n>>m;
    for(i=0;i<n;i++)
    cin>>a[i];
    for(i=0;i<n;i++)
    {
        if(a[i]<m)//to check any seats will left over or not
        {
            if(a[i+1]!='\0' && a[i]+a[i+1]<=m)//here we 1st check weather i+1 th element exist or not and sum
            {
                count++;i++;//if a[i]and a[i+1]are <= m is true we increase count and i
                //we increase i because we already inserted net group also so we increase i
            }else{// if i and i+1 th sum is != m we simply insert i th group into bus and increase count
                count++;
            }
        }
        else//this is for a[i] == m 
        count++;
    }
    cout<<count;
}