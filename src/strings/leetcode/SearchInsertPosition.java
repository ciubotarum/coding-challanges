package strings.leetcode;

public class SearchInsertPosition {
//    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
//    return the index where it would be if it were inserted in order.
//
//    You must write an algorithm with O(log n) runtime complexity.
//
//
//    Example 1:
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2

//    Example 2:
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1

//    Example 3:
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] >= target) {
                return 0;
            }
            return 1;
        }

        return search(nums, target, 0, nums.length - 1);
    }

    public static int search(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return search(nums, target, left, mid - 1);
        } else if (nums[mid] < target) {
            return search(nums, target, mid + 1, right);
        }
        return 0;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,5,6};
//        int target = 5;             // 2
//        int target = 2;               // 1
//        int target = 7;               // 4


//        int[] nums = {1,3,5};
//        int target = 5;              // 2

//        int[] nums = {1,4,6,7,8,9};
//        int target = 6;              // 2

        int[] nums = {1, 2, 4, 6, 7};
        int target = 3;              // 2

        System.out.println(searchInsert(nums, target));
    }
}
