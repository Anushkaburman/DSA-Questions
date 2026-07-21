class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(0,candidates,target,curr,ans);
        return ans;
    }
    void helper(int index,int[] candidates,int target,List<Integer>curr,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(index == candidates.length){
            return;
        }
        if(candidates[index]<=target){
            curr.add(candidates[index]);
            helper(index,candidates,target-candidates[index],curr,ans);
            curr.remove(curr.size()-1);
        }
        helper(index+1,candidates,target,curr,ans);
        
    }
}