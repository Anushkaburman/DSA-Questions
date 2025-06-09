#include<bits/stdc++.h>
using namespace std;
vector<string>str;


	void reverse(string &s,int first,int second){
		while(first<second){
			swap(s[first],s[second]);
			first++;
			second--;
		}
	}

	void rotate(string s){
		int n=s.size();
		for(int i=0; i<n; i++){
			int k=1;
		  reverse(s,0,n-1);
		  reverse(s,0,k-1);
		  reverse(s,k,n-1);
		  k++;

		  str.push_back(s);
		}  
	}
	int main(){
		string s;
		cin >> s;


		string goal;
		cin >> goal;
		rotate(s);
		bool count=false;
		

		for(string ch: str){
			if(ch==goal){
				cout<<"true"<<endl;
				return 0;
			}
		}
		
			cout<<"false"<<endl;

		}
	
	
