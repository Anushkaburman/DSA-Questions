#include<bits/stdc++.h>
using namespace std;

int main(){
	int w;
	cin >> w;
	if(w%2==0){
		int n1=w/2;
		int n2=w-n1;
		if(n1%2==0 && n2%2==0){
			cout<<"yes"<<endl;
		}
	}
	else
		cout<<"no"<<endl;
}  