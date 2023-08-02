class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result = 0;
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
                result = nums[i] + nums[j];
                
                if(result==target){
                   res[0]=i;
                   res[1]=j;
                    
                   break;
                }
            }
        }
        return res;
    }
}