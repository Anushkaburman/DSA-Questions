class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>ans = new ArrayList<>();
        List<int[]>list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int[] interval : intervals){
            ans.add(interval);
        }
           
        ans.add(newInterval); 
            
        ans.sort((a,b)->a[0]-b[0]);
        for(int[] x: ans){
            if(list.isEmpty()||list.get(list.size()-1)[1]<x[0]){
                list.add(x);
            }else{
                int max = Math.max(list.get(list.size()-1)[1],x[1]);
                list.get(list.size()-1)[1] = max;
            }
        }
        return list.toArray(new int[list.size()][]);

    }
}