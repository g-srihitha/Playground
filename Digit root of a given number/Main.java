#include<iostream>
int add(int n){
  int sum=0;
  while(n>0){
    sum+=(n%10);
    n=n/10;
  }
  if(sum/10!=0){
    add(sum);}
  else
    return sum;
}
int main(){
  int a;
  std::cin>>a;
  std::cout<<add(a);
}