package leetcodeorlintcode.sumII;

import java.util.Arrays;

public class Solution2 {
    public int twoSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int index = binarySearch(nums, target - nums[i - 1], i, nums.length - 1);
            count += nums.length - index;
        }
        return count;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        int mid;
        int sum;
        while (start + 1 < end) {
            mid = start + (end - start) /2;
            if (mid - 1 >= 0 && nums[mid-1] <= target && target < nums[mid]) {
                return mid;
            } else if (mid + 1 < nums.length &&  nums[mid] <= target && target < nums[mid + 1]) {
                return mid + 1;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] > target) {
            return start;
        }
        return (nums[end] > target) ? end : nums.length;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        int target = 12;
        Solution s = new Solution();
        int n = s.twoSum2(a, target);

        System.out.println(n);
    }
}
