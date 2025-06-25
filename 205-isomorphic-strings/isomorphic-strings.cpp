class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char>m;
        unordered_map<char,char>m1;
        if(s.size()!=t.size()){
            return false;
        }
        for(int i=0; i<s.size(); i++){
            char c1 = s[i];
            char c2 = t[i];
            if(m.count(c1)){
                if(m[c1]!=c2){
                    return false;
                }
            }
            else{
                m[c1] = c2;
            }
            if(m1.count(c2)){
                if(m1[c2]!=c1){
                    return false;
                }
            }
            else{
                m1[c2] = c1;
            }
        }
            return true;
    }
};