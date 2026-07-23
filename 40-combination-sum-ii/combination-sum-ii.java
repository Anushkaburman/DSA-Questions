class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(0,candidates,target,curr,ans);
        return ans;

    }
    void helper(int index,int[] candidates,int target,List<Integer> curr,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
       
       for(int i=index; i<candidates.length; i++){
        if(i>index && candidates[i]==candidates[i-1]){
            continue;
        }
        if(candidates[i]>target){
            break;
        }
        curr.add(candidates[i]);
        helper(i+1,candidates,target-candidates[i],curr,ans);
        curr.remove(curr.size()-1);
       }
    }
}