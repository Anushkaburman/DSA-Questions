#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	while(t--){
		int costPurple;
		cin >> costPurple;

		int costGreen;
		cin >> costGreen;
		int p;
		cin >> p;
		int countP=0;
		int countG=0;
		for(int i=0; i<p; i++){
			int x;
			int y;
			cin>>x>>y;
			countP+=x;
			countG+=y;
		}
		int cost1=(costPurple*countP)+(costGreen*countG);
		int cost2=(costPurple*countG)+(costGreen*countP);

		cout<<min(cost1,cost2)<<endl;
    }

}       
