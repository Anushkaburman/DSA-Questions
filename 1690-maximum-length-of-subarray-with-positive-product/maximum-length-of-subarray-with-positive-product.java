class Solution {
    public int getMaxLen(int[] nums) {
       int pos = 0;
        int neg = 0;
        int ans = 0;
        for(int num : nums){
            if(num>0){
                pos++;

                if(neg>0){
                    neg++;
                }
            }else if(num<0){
                int temp = pos;
                if(neg>0){
                    pos = neg + 1;
                }else{
                    pos = 0;
                }
                neg = temp + 1;
            }else{
                pos = 0;
                neg = 0;
            }

            ans = Math.max(ans,pos);
        }
        return ans;
    }
}