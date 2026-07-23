class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>mp = new HashMap<>();
        int result = 0;
        boolean odd = false;
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int count : mp.values()){
            if(count%2==0){
                result += count;
            }else{
                result += count - 1;
                odd = true;
            }
        }
        if(odd){
            result += 1;
        }
        return result;
    }
}