#include<iostream>
using namespace std;
struct time
{ 
  int hours;
  int mins;
  int seconds;
}t1,t2; //Structure variables 
void timediff(struct time t1,struct time t2,struct time *diff);
int main()
{
  struct time diff;
  cin>>t1.hours>>t1.mins>>t1.seconds;
  cin>>t2.hours>>t2.mins>>t2.seconds;
  timediff(t1,t2,&diff);
  cout<<diff.hours<<":"<<diff.mins<<":"<<diff.seconds;
}
void timediff(struct time start,struct time end,struct time *diff)
{
  if(end.seconds>start.seconds)
  {
    --start.mins;
    start.seconds+=60;
  }
  diff->seconds=start.seconds-end.seconds;
  if(end.mins > start.mins)
  {
    --start.hours ;
    start.mins+=60;
  }
  diff->mins=start.mins- end.mins;
  diff->hours=start.hours-end.hours;
}


  
  