class Solution {
public:
    int findLHS(vector<int>& nums) {
        unordered_map<int,int>map;
        for(int i : nums){
            map[i]++;
        }
        int result=0;
        for(auto it : map){
            int x = it.first;

            if(map.find(x+1)!=map.end()){
                result = max(result,map[x] + map[x+1]);
            }
        }
        return result;
    }
};