class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
               i++;
               j++;
               count++; 
            }
            else{
                j++;
            }
        } 
    return count;
    }
}


// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);
//         Arrays.sort(s);
//         boolean used[] = new boolean[s.length];
//         int count = 0;
//         for(int i=0; i<g.length; i++){
//             for(int j=0; j<s.length; j++){
//                 if(!used[j] && s[j]>=g[i]){
//                     count++;
//                     used[j] = true;
//                     break;

//                 }
//             }
//         }
//         return count;

//     }
// }


// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         int count = 0;
//         for(int i=0; i<g.length; i++){
//             for(int j=0; j<s.length; j++){
//                 if(s[j]>=g[i]){
//                     count++;
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }