#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[200];
  int i,v,c,d,w,sy;
  v=c=d=w=sy=0;
  cin.getline(s,200);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'||
       s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
    {
      ++v;
    }
    else if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z')) {
            ++c;
    }
    else if(s[i]>='0' && s[i]<='9')
    {
      ++d;
    }
    else if(s[i]==' ')
    {
      ++w;
    }
    else
      ++sy;
  }
    cout<<"Vowels:"<<v<<endl;
    cout<<"Consonants:"<<c<<endl;
    cout<<"White Spaces:"<<w<<endl;
    cout<<"Digits:"<<d<<endl;
    cout<<"Symbols:"<<sy;
  }
  
  
