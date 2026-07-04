class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>mp = new HashMap<>();
        HashMap<Character,Integer>mp2 = new HashMap<>();
        for(char c : s1.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int left=0;
        for(int right=0; right<s2.length(); right++){
            char ch = s2.charAt(right);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            while(right-left+1>s1.length()){
                char leftchar = s2.charAt(left);
                mp2.put(leftchar,mp2.get(leftchar)-1);

                if(mp2.get(leftchar)==0){
                    mp2.remove(leftchar);
                }
                left++;
            }
            if(right-left+1==s1.length()){
                if(mp2.equals(mp)){
                    return true;
                }
            }
        }
        return false;
    }
}