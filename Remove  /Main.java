#include<iostream>
using namespace std;
int main()
{
  char s[200];
  cin.getline(s,200);
  int i=0;
  while(s[i]!='\0')
  {
    if(s[i]=='t')
    {
      i++;
      if(s[i]=='h')
      {
        i++;
        if(s[i]=='e')
        {
          i++;
          if(s[i]==' ')
            i++;
        }
      }
      else
      {--i;
       cout<<s[i];
       i++;
       cout<<s[i];
       i++;
      }
    }
    else
    {
      cout<<s[i];
      i++;
    }
  }
}
