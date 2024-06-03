class Solution {
    public int appendCharacters(String s, String t) {
        int i1 = 0;
        int i2 = 0;
        int count  = 0;
        while(i1<s.length() && i2 < t.length()){
            if(s.charAt(i1) == t.charAt(i2)){
                i1++;
                i2++;
            
            }else{
                i1++;
            }
           
        }
        return t.length() - i2;
    }
}
