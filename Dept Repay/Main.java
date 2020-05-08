#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  float a,rate,d,f;
  cin>>p>>t>>r;
 
  a=((p*t*r)/100)+p;
  rate=(p*t*r)/100;
  d=0.02*rate;
  f=a-d;
  cout<<rate;
  cout<<"\n"<<a;
  cout<<"\n"<<d;
  cout<<"\n"<<f;
}