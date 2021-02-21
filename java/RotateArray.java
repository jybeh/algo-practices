class RotateArray {
    /**
    * This method will rotate an array to the right by given k times
    *
    * @param  nums  the array to be rotated
    * @param  k the number of times to rotate
    * @see         Image
    */
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        int[] tempKArray = new int[k];
        for(int i = 0; i < k; i++){
            tempKArray[i] = nums[(nums.length - k) + i];
        }
           
        //4 -> 0  result in 7 6 5 4 
        for(int i = nums.length-k-1; i >= 0; i--){
            nums[i+k] = nums[i];
        }
        
        for(int i = 0; i < k; i++){
            nums[i] = tempKArray[i];
        }
    }
}