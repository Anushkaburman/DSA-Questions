class Solution {
public:
    int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }
        int parent = kthGrammar(n-1,(k+1)/2);
        bool isodd = k%2;
        if(parent == 0 ){
            return(isodd ? 0:1);
        }
        else{
            return(isodd ? 1:0);
        }
       
    }
};