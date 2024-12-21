class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int max=0;
        int sum=0;
        HashSet<Integer>h=new HashSet<>();
        for(int r=0;r<nums.length;r++){
          while(h.contains(nums[r])){
            h.remove(nums[l]);
            sum-=nums[l];
            l++;
          }
          h.add(nums[r]);
          sum+=nums[r];
          max=Math.max(sum,max);
        }
        return max;
        
    }
}