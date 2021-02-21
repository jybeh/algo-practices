class TwoSum {
    /**
    * This method is a brute force method on finding two integers that add up to the target
    *
    * @param  nums the array to find
    * @param  target the target value for two integers 
    * @return an array of two elements that add up to the target
    */
    public int[] twoSum(int[] nums, int target) {
        
        int results[] = new int [2];    //declaring array
                
        for(int i=0; i<nums.length;i++) {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }
        
        return results;
    }
}