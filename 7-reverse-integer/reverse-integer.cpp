class Solution {
public:
    int reverse(int x) {
        long long reverse = 0;
        while(x!=0){
            long long temp = x%10;
            reverse = reverse * 10 + temp;
            x = x/10;
        }
        if(reverse>INT_MAX || reverse<INT_MIN){
            return 0;
        }
        else{
            return reverse;
        }
    }
};