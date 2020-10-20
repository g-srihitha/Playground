#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    char name[100];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  cin.get(s.name,100);
  cin>>s.roll;
  cin>>s.marks;
  cout<<endl;
  cout<<"Student Details"<<endl;
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks<<endl;
  
}