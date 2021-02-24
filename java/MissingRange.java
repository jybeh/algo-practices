class MissingRange {

    private static String EMPTY_STRING = ""; 
    private static String RANGE_ARROW = "->"; 
    
    /**
     * This method is used to find the missing range in an array of unique sorted int array.
     *
     * @param  nums the array to compute
     * @param  lower start of the range inclusive
     * @param  upper end of the range inclusive
     * @return a list of string with missing range e.g. ["2"] //if start and end are the same number, ["4->11"]
    */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<String> result = new ArrayList<>();
        
        if(nums.length == 0){
            addRangeToList(getRangeInBetween(lower-1, upper+1), result);
            return result;
        }
        
        addRangeToList(getRangeInBetween(lower-1, nums[0]), result);
        
        for(int i = 0; i < nums.length-1 ; i++){
            String range = getRangeInBetween(nums[i], nums[i+1]);
            addRangeToList(range, result);
        }
        
        addRangeToList(getRangeInBetween(nums[nums.length-1], upper+1), result);
        
        return result;
        
    }
    
    private void addRangeToList(String range, List<String> listToAdd){
        if(EMPTY_STRING == range){
            return;
        }
        listToAdd.add(range);
    }
    
    private String getRangeInBetween(int num1, int num2){
        if((num2-num1) == 0 || (num2-num1) == 1){
            return EMPTY_STRING;
        }
        
        int startOfRange = num1 + 1;
        int endOfRange = num2 - 1;
        
        if(startOfRange == endOfRange){
            return String.valueOf(startOfRange);
        }
        
        return String.valueOf(startOfRange) + RANGE_ARROW + String.valueOf(endOfRange);
    }
}