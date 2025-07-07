class Solution {
public:
    string backspace(string v){
        stack<int>st;
        for(char c : v){
            if(c == '#'){
                if(!st.empty()) st.pop();
            }
            else{
                st.push(c);
            }
        }
        string s1;
        while(!st.empty()){
            s1 += st.top();
            st.pop();
        }
        reverse(s1.begin(),s1.end());
        return s1;
    }

    bool backspaceCompare(string s, string t) {
        return backspace(s)==backspace(t);
    }
};