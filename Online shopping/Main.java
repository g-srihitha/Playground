#include<iostream>
using namespace std;
int main()
{
  int ft,fd,fs,st,sd,ss,at,ad,as,p,tp1,tp2,tp3;
  cin>>ft>>fd>>fs>>st>>sd>>ss>>at>>ad>>as;
  p=(100-fd)*ft/100;
  tp1=p+fs;
  cout<<"In Flipkart Rs."<<tp1<<"\n";
  p=(100-sd)*st/100;
  tp2=p+ss;
  cout<<"In Snapdeal Rs."<<tp2<<"\n";
  p=(100-ad)*at/100;
  tp3=p+as;
  cout<<"In Amazon Rs."<<tp3<<"\n";
   if(tp1<=tp2 && tp1<=tp3)
    cout<<"He will prefer Flipkart \n";
  if(tp2<tp1 && tp2<=tp3)
    cout<<"He will prefer Snapdeal \n";
  if(tp3<=tp1 && tp3<=tp2)
    cout<<"He will prefer Amazon \n";
}