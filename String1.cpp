#include<bits/stdc++.h>
using namespace std;

int main(){
	string s1;
	string s2;
	cin >> s1;
	//cin >> s2;
	for(int i=s1.size()-1; i>=0; --i){
		s2.push_back(s1[i]);
	}
	cout<<s2<<endl;
	if(s1==s2){
		cout<<"YES";
	}
	else
		cout<<"NO";
}