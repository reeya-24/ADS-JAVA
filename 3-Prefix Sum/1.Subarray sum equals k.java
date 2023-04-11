//leetcode 560
class Solution {
    public int subarraySum(int[] nums, int k) {

        int[] arr = new int[nums.length+1];
        for(int i = 1; i < arr.length; i++)
        {
            arr[i] = arr[i-1]+nums[i-1];
        }
        int count = 0;
        for(int i = 1; i < arr.length; i++)
        {
            int b = arr[i]-k;
            for(int j = 0; j < i; j++)
            {
                if(arr[j] == b)
                    count++;
            }
        }
        return count;
        
    }
}
