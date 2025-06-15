#include<bits/stdc++.h>
using namespace std;

int main(){
	int n;
	cin>>n;

	unordered_map<string,int>m;
	while(n--){
		int type;
		cin >> type;
		string str;
		cin >> str;
		

		if(type==1){
			int marks;
		    cin >> marks;
			m[str]+=marks;
		}
		if(type==2){
			m.erase(str);
		}
		if(type==3){
			cout<<m[str]<<endl;
		}
	}

}
