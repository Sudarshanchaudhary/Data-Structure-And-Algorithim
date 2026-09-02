class Solution {
    public boolean uniformArray(int[] nums1) {

        if (nums1.length == 1) return true;

        int evenCount = 0;
        int oddCount = 0;

        for (int num : nums1) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        
        boolean allEvenPossible = (evenCount > 0) || (oddCount >= 2);

    
        boolean allOddPossible = (oddCount > 0) && (evenCount > 0);

        return allEvenPossible || allOddPossible;
        
    }
}