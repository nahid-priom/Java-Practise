public class IndexSearch {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}

public class BinaryIndexSearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        
        int index = new Solution().searchInsert(nums, target);
        System.out.println("Target would be inserted at index: " + index);
    }
}
