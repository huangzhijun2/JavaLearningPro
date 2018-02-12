package leetcodeorlintcode.threesumclosest;
import java.util.Arrays;
/**
 *
 Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers.
 Note
 You may assume that each input would have exactly one solution.
 Example
 For example, given array S = {-1 2 1 -4}, and target = 1. The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 Tags Expand
 Two Pointers Sort Array
 */
public class Solution {

    public int threeSumClosest(int[] num, int target) {
        if (num == null || num.length < 3) {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(num);
        long closest = (long) Integer.MAX_VALUE;
        for (int i = 0; i < num.length - 2; i++) {
            int left = i + 1;
            int right = num.length - 1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                closest = Math.abs(sum - target) < Math.abs(closest - target)
                        ? (long) sum : closest;
            }//while
        }//for
        return (int) closest;
    }


    public static void main(String[] args) {
        int[] s = new int[]{-1,2,1,-4};
        int target = 1;
        Solution so = new Solution();
        int i = so.threeSumClosest(s, target);
        System.out.println(i);


    }
}
