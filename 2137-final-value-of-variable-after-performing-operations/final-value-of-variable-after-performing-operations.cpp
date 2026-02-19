class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int x = 0;
        for(int i = 0; i<operations.size();i++){
            string operation = operations[i];
            if(operation.contains("+")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
};