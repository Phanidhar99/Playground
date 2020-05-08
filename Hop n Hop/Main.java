#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,r,d;
  cin>>a>>b;
  r=(a-3)*(a-3);
  d=(b-4)*(b-4);
  r=r+d;
  d=pow(r,0.5);
  cout<<d;
}