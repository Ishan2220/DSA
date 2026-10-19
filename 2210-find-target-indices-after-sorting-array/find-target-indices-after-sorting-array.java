import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int n = nums.length;
        if(n==0){
            return arr;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                arr.add(i);

            }
        }
        return arr;

    }
}