class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> Set = new HashSet<>();

        for( int i : nums){
            if(!Set.add(i)) {
                return true;
            }
        }
        return false ;
    }
}