/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        int peak = left;
        int ans = binarySearchAsc(mountainArr, target, 0, peak);
        if (ans != -1) {
            return ans;
        }

        return binarySearchDsc(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    private int binarySearchAsc(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchDsc(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}