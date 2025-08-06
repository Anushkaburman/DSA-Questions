class Solution {
public:
    bool hasGroupsSizeX(vector<int>& deck) {
        unordered_map<int,int>freq;
        for(int val : deck){
            freq[val]++;
        }
        int gcdval = 0;
        for(auto &[val,count] : freq){
            gcdval = __gcd(gcdval,count);
        }
        return gcdval >=2;
    }
};