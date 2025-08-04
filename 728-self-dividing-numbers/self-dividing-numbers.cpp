class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> arr;
        for(int i = left; i<=right; i++){
            int temp = i;
            bool isfound = true;

            while(temp!=0){
                int rem = temp % 10;
                if(rem == 0 || i%rem != 0){
                    isfound = false;
                    break;
                }
                temp = temp/10;
            }
            if(isfound){
                arr.push_back(i);
            }
        }
        return arr;
    }
};