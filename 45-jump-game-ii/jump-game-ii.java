class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int curr = 0;
        int jump = 0;
        for(int i=0; i<nums.length-1; i++){
            jump = Math.max(jump,i+nums[i]);
            if(i==curr){
                count++;
                curr = jump;
            }
        }
        return count;
    }
}