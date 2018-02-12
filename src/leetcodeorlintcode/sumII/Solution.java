package leetcodeorlintcode.sumII;
import java.util.Arrays;
/*
    Given an array of integers, find how many pairs in the array such that
    their sum is bigger than a specific target number. Please return the number of pairs.
    Example
    numbers=[2, 7, 11, 15], target=24
    return 1
    Challenge
    Either of the following solutions are acceptable:
    O(1) Space, O(nlogn) Time
    Tags Expand
    Two Pointers
*/
public class Solution {
    public int twoSum2(int[] nums,int target){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);


        while (left < right){
            if(nums[left] + nums[right] > target){
                count += (right - left);
                right--;
            }else {
                left ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        int target = 12;
        Solution s = new Solution();
        int n = s.twoSum2(a, target);

        System.out.println(n);

    }
}
