class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();
        boolean[] used = new boolean[digits.length];
        helper(digits, 0, 0, used, set);
        int[] ans = new int[set.size()];
        int i = 0;
        for (int num : set) {
            ans[i++] = num;
        }
        return ans;
    }

    void helper(int[] digits, int pos, int num, boolean[] used, TreeSet<Integer> set) {
        if (pos == 3) {
            if (num >= 100 && num % 2 == 0) {
                set.add(num);
            }
            return ;
        }
        for (int i = 0; i < digits.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            helper(digits, pos + 1, num * 10 + digits[i], used, set);
            used[i] = false;
        }
    }
}