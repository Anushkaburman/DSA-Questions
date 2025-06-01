class Solution {
    public boolean isPalindrome(long x) {
        if(x<0){
            return false;
        }
       long reverse = 0;
        long temp = x;
        while(temp>0){
            long r = temp%10;
            reverse = reverse *10+r;
            temp = temp/10;
        }
        if(x==reverse){
            return true; 
        }
        else{
        return false;
        } 
    }
}