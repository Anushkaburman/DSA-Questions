class Solution {
public:
    bool isHappy(int n) {
        
        unordered_set<int>st;
        while(n!=1){
            if(st.contains(n)){
                return false;
            }else{
                st.insert(n);
            }
            int sum = 0;
            while(n>0){
                int digit = n%10;
                sum += digit * digit;
                n = n/10;
            }
           n=sum;
        }
        return true;
    }
};