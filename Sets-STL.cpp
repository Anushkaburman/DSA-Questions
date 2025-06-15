#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	set<int>s;
	while(t--){
		int x;
		cin >> x;
		int n;
		cin >> n;
		if(x==1){
			s.insert(n);
		}
		if(x==2){
			s.erase(n);
		}
		if(x==3){
			auto it=s.find(n);
			if(it!=s.end()){
				cout<<"yes"<<endl;
			}
			else{
				cout<<"no"<<endl;
			}
		}
	}
}