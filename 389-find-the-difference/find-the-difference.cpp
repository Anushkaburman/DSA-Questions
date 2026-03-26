class Solution {
public:
    char findTheDifference(string s, string t) {
        char r = 0;
        for(char c : s){
            r = r ^ c;
        }
        for(char e : t){
            r = r ^ e;
        }
        return r;
    }
};