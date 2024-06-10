class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int exp[] = Arrays.copyOf(heights,n);
        Arrays.sort(exp);
        int count = 0;
        int i = 0 ; 
        
        while(i<n){
            if(heights[i] != exp[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
