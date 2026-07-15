class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; 
        helper(nums,curr,used,ans);
        
        return ans;
    }

    void helper(int[] nums, List<Integer> curr,boolean[] used,List<List<Integer>> ans){
        for(int i=0; i<nums.length; i++){
            if(curr.size()==nums.length){
                ans.add(new ArrayList<>(curr));
                return;
            }
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);

            helper(nums,curr,used,ans);
            curr.remove(curr.size()-1);
            used[i] = false;

        }
    }
}