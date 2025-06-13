#include<bits/stdc++.h>
using namespace std;


vector<int> fibonacciNumbers(int n) {
        vector<int> fib;
        if(n>=1){
            fib.push_back(0);
        }
        if(n>=2){
            fib.push_back(1);
        }
        for(int i=2; i<n; i++){
            fib.push_back(fib[i-1]+fib[i-2]);
        }
        return fib;
        
    }


int main(){
	int n;
	cin >> n;
	vector<int> a=fibonacciNumbers(n);
	for(int num: a){
		cout<<num<<" "<<endl;
	}
}