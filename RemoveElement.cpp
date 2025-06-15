#include<bits/stdc++.h>
using namespace std;

int removeElement(vector<int>&nums,int &val){
	vector<int>s;
	for(int i=0; i<nums.size(); i++){
		if(val!=nums[i]){
			s.push_back(nums[i]);
		}
	}
		int count=0;
		for(int i=0; i<s.size(); i++){
			count++;
		}

		return count;
	
}
int main(){
	int n;
	cin >> n;
	vector<int>nums(n);
	for(int i=0; i<nums.size(); i++){
		cin >> nums[i];
	}
	int val;
	cin >> val;
	int k=removeElement(nums,val);
	cout<<k<<endl;	
}

// int main(){
// 	int k;
// 	int n;
// 	cin >> k >> n;

// 	vector<int>s(n);
// 	vector<int>v;
// 	for(int i=0; i<n; i++){
// 		cin >> s[i];
// 	}
// 	for(int i=0; i<n; i++){
// 		if(k!=s[i]){
// 			v.push_back(s[i]);
// 		}
// 	}
// 	int count=0;
// 	for(int i=0; i<v.size(); i++){
// 		count++;
// 	}
// 	cout<<count<<endl;
// }