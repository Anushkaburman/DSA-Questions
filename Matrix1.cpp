#include<bits/stdc++.h>
using namespace std;

int main(){
	int n;
	cin >> n;
	int m;
	cin >> m;
	int arr[n][m];
	for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
           cin >> arr[i][j];
		}
	}
	int row[n]={0};
	int col[m]={0};
	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
             row[i]+=arr[i][j];
             col[j]+=arr[i][j];
		}
	}
	for(int i=0; i<min(n,m); i++){
		if(row[i]==col[i]){
			cout<<1<<endl;
			return 0;
		}
	}
	cout<<0<<endl;
}