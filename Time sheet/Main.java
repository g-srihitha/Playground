#include<iostream>
using namespace std;
int main()
{
  int s,m,t,w,th,f,sat,ts,tt;
  cin>>s>>m>>t>>w>>th>>f>>sat;
  if(s==0)
    ts=0;
  else
    (s>=1 && s<=8)?(ts=(s*100)+(s*(100*50)/100)):(ts+=(s*100)+(s-8)*15+(s*(100*50)/100));
    (m>=0&&m<=8)?(ts+=m*100):(ts+=(m*100)+((m-8)*15));
    (t>=0&&t<=8)?(ts+=t*100):(ts+=(t*100)+(t-8)*15);
    (w>=0&&w<=8)?(ts+=w*100):(ts+=(w*100)+(w-8)*15);
    (th>=0&&th<=8)?(ts+=th*100):(ts+=(th*100)+(th-8)*15);
    (f>=0&&f<=8)?(ts+=f*100):(ts+=(f*100)+(f-8)*15);
  if(sat==0)
    ts+=0;
  else
    (sat>=1&&sat<=8)?(ts+=(sat*100)+sat*(100*25)/100):(ts+=sat*100+(sat-8)*15+s*(100*25)/100);
  tt=s+m+t+w+f+sat;
  if(tt>40)
    ts+=((tt-40)*25);
    cout<<ts;
  
  
 }