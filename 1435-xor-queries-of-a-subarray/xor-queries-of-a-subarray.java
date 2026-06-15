class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] ans = new int[queries.length];
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        for(int i=0; i<arr.length; i++){
            prefix[i+1] = arr[i] ^ prefix[i];
        }
        for(int i=0; i<queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = prefix[right+1] ^ prefix[left];
        }
        return ans;
    }
}