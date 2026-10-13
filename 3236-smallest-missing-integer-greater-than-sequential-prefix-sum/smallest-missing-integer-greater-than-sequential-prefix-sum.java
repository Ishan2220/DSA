class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                count++;
            } else {
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i <= count; i++) {
            sum += nums[i];
        }

        boolean found = true;

        while (found) {
            found = false;

            for (int i = 0; i < n; i++) {
                if (nums[i] == sum) {
                    sum++;
                    found = true;
                    break;
                }
            }
        }

        return sum;
    }
}