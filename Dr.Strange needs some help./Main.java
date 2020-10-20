#include<iostream>
#include<math.h>
int main(){
  int m,n,req,p;
  std::cin>>m>>n>>req;
  p=pow(m,n);
  if(p>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
    