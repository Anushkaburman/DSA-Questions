#include<bits/stdc++.h>
using namespace std;

	void reverse(int arr[],int first,int second){
		while(first<second){
			swap(arr[first],arr[second]);
			first++;
			second--;
		}
	}

	void rotate(int arr[],int n,int k){
		 k=k%n;
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
	}
	int main(){
		int n;
		cin >> n;
		int arr[n];
		int k;
		cin >> k;
		for(int i=0; i<n; i++){
			cin >> arr[i];
		}
		rotate(arr,n,k);
		for(int i=0; i<n; i++){
			cout << arr[i];
		}

	}
 