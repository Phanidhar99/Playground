#include <iostream>
using namespace std;
 
int main() {
    int i, n, factorial = 1;
    cin>>n;
 
    for (i = 1; i <= n; ++i) {
        factorial *= i;   // factorial = factorial * i;
    }
    cout<<factorial;
    
 return 0;
}