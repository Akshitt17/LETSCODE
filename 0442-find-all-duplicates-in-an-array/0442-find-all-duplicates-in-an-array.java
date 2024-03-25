class Solution {
    public List<Integer> findDuplicates(int[] nums) {     
        ArrayList<Integer> ans = new ArrayList<>();           
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1]<0) ans.add(index);
            nums[index-1] = -nums[index-1];            
        }
        return ans;
    }
}