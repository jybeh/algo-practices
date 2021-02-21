class FirstUniqueChar {
    /**
    * This method will find the first unique letter in a given string
    *
    * @param  s  the string to be tested
    * @return the index of the first unique letter, -1 if no unique character exists
    */
    public int getIndexOfFirstUniqueCharacter(String s) {
        
        Map<Character, Integer> charCountMap = new HashMap();
        
        for(int i = 0; i< s.length(); i++){
            if(charCountMap.containsKey(s.charAt(i))){
                charCountMap.put(
                    s.charAt(i), 
                    charCountMap.get(s.charAt(i)) + 1);
                continue;
            }
            charCountMap.put(s.charAt(i), 1);
        }
        
        
        for(int i = 0; i< s.length(); i++){
            if(charCountMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }
}