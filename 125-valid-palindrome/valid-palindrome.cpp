class Solution {
public:
    bool isPalindrome(string s) {
        string st = "";
        for (int i = 0; i < s.size(); i++) {
            s[i] = tolower(s[i]);
        }
        for (int i = 0; i < s.size(); i++) {
            if (isalnum(s[i])) {
                st += s[i];
            }
        }
        int left = 0;
        int right = st.size() - 1;
        string st2 = st;
        while (left < right) {
            char temp = st[left];
            st[left] = st[right];
            st[right] = temp;
            left++;
            right--;
        }
        if (st2 == st) {
            return true;
        }
        return false;
    }
};