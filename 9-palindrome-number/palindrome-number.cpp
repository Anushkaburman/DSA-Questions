class Solution {
public:
    bool isPalindrome(int x) {
        long long reverse = 0;
        int temp = x;
        while(x!=0){
            long long r = x%10;
            reverse = reverse * 10 + r;
            x = x/10;
        }
        if(reverse != temp || reverse < 0){
            return false;
        }else{
            return true;
        }
    }
};