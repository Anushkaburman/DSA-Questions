#include<bits/stdc++.h>
using namespace std;

int main(){
	string s1;
	cin >> s1;
	int count=0;
	int x=0;
	for(int i=0; i<s1.length(); i++){
		if(s1[i]=='A'){
           count++;
		}
		if(s1[i]=='L'){
           x++;
		}
	}
	if(count<2 && (x!=3 || x<3)){
		cout<<"true"<<endl;
	}
	else{
		cout<<"false"<<endl;
	}
}