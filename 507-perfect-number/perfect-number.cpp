class Solution {
public:
    bool checkPerfectNumber(int num) {
        vector<int>arr;
        for(int i = 1; i<num; i++){
            if(num % i == 0){
                arr.push_back(i);
            }
        }
        int sum = 0;
        for(int i = 0; i<arr.size(); i++){
            sum = sum + arr[i];
        }
        return (sum == num)?true:false;
    }
};