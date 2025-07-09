class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack<int>st;
        for(string op : operations){
            if(op == "C"){
                if(!st.empty()) st.pop();
            }
            else if(op == "D"){
                if(!st.empty())st.push(2*st.top());
            }
            else if(op == "+"){
                int top1 = 0;
                int top2 = 0;
                if(!st.empty()){
                    top1 = st.top();
                    st.pop();
                }
                if(!st.empty()){
                    top2 = st.top();
                }
                if(top1!=0)st.push(top1);
                st.push(top1 + top2);
            }
            else{
                st.push(stoi(op));
            }
        }
        int sum =0 ;
        while(!st.empty()){
            sum += st.top();
            st.pop();
        }
        return sum;
    }
};