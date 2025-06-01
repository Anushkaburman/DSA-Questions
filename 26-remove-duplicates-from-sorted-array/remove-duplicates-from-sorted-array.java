class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int newlength = 0;
        for(int i=0 ; i<nums.length ; i++){
            boolean isDuplicate = false;
            for(int j=0 ; j<newlength ; j++){
            if(nums[i]==temp[j]){
                 isDuplicate = true;
                break;
            }
        }
        if(!isDuplicate){
            temp[newlength] = nums[i];
            newlength++;
        }
    }
     for(int i=0 ; i<newlength ; i++){
      nums[i] = temp[i];
     }
      return newlength;
}
}