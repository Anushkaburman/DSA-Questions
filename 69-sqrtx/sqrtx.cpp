class Solution {
public:
    int mySqrt(long long x) {
         if(x == 0){
            return 0;
        }
        long long lo = 1;
        long long hi = x;
        long long result = 1;
       
        
            while(lo<=hi){
                long long mid = lo + (hi - lo)/2;
                if(mid*mid <= x){
                    result =  mid;
                    lo = mid + 1;
                }else{
                
                    hi = mid - 1;
                }
            }
        
        return result;
    }
};