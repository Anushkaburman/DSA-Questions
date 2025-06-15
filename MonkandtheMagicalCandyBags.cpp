#include<bits/stdc++.h>
using namespace std;

int main(){
int t;
cin >> t;

  while(t--){
	int n;
	cin >> n;
	int k;
	cin >> k;
	multiset<long long>bag;
	for(int i=0; i<n; i++){
		int candies;
		cin >> candies;
		bag.insert(candies);
	}
	  long long total=0;
	 for(int i=0; i<k; i++){
		auto it = --bag.end();
		long long candy=*(it);
		total+=candy;
		bag.erase(it);
		bag.insert(candy/2);
	  }
	 cout<<total<<endl;
    }
}