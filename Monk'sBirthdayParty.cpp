#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	while(t--){
		int n;
		cin >> n;
		vector<string>a(n);
		set<string>s;
		for(int i=0; i<n; i++){
			cin >> a[i];
		}
		for(int i=0; i<n; i++){
			s.insert(a[i]);
		}
		for(auto it=s.begin(); it!=s.end(); it++){
			cout<<(*it)<<endl;
		}
	}
}