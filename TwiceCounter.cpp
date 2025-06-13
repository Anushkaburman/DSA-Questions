#include<bits/stdc++.h>
using namespace std;


int main(){
	vector<string>s;
	int n;
	cin >> n;

	for(int i=0; i<n; i++){
		string str;
		cin >> str;
		s.push_back(str);
	}
	int count=0;
	for(int i=0; i<n; i++){
		for(int j=1; j<i; j++){
		  if(s[i]==s[j]){
			count++;}
		}
	}
	cout<<count<<endl;
}
