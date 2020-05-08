#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int boys=0, girls=0;
    for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      girls++;
    }
      else
        boys++;
  }
  cout<<boys<<endl;
  cout<<girls;
  return 0;
}