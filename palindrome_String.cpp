#include<bits/stdc++.h>
using namespace std;

int main(){
	string s1;
	string s2="al";
	cin>>s1;

	//cin>>s2;
	for(int i=0; i<=s1.size(); i++){
		if(s1[i]=="()"){
			s1[i]='o';
		}
		if(s1[i]=="(al)"){
			s1[i]=s2;
		}
	}
	cout<<s1<<endl;
}