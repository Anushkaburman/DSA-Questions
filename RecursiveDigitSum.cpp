#include<bits/stdc++.h>
using namespace std;


int SuperDigit(int x){
	if(x==0) {
		return 0;
	}
	return SuperDigit(x/10) + (x%10);
}

int main(){
	 int x;
	 cin>>x;

	 cout<<SuperDigit(x)<<endl;
}