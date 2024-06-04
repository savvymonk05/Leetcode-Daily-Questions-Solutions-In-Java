class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);
        }
        boolean isFirstodd = false;
        for(char key : map.keySet()){
            if(map.get(key)%2 == 0){
                ans+= map.get(key);
            }
            else{
                ans+= map.get(key);
                if(!isFirstodd){
                    isFirstodd = true;
                }
                else{
                    ans-= 1;
                }
            }
        }
        return ans;
    }
}
