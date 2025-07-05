class Solution {
public:
    string removeDuplicates(string s) {
        stack<char>st;
        for(int i=0; i<s.size(); i++){
            char ch = s[i];
            
            if(!st.empty() && st.top() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        string s2;
        while(!st.empty()){
            s2.push_back(st.top());
            st.pop();
        }
        reverse(s2.begin(),s2.end());
        return s2;
    }
};