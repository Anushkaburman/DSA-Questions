#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	
	while(t--){
		int n;
		cin >> n;
		int m;
		cin >> m;
		vector<int>s(n+m);
	    set<int>a;
		for(int i=0; i<n+m; i++){
			cin >> s[i];
		}
		for(int i=0; i<n; i++){
			a.insert(s[i]);
		}
		for(int i=n; i<n+m; i++){
			if(a.count(s[i])){
				cout<<"YES"<<endl;
			}
			else{
				cout<<"NO"<<endl;
			}
			a.insert(s[i]);
		}
	}
}