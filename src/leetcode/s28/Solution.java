package leetcode.s28;

public class Solution {
    public static void main(String[] args) {
        String s = "mississippi";

        int i = new Solution().strStr(s, "issip");
        System.out.println(i);
    }
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int i = 0;
        int j ;
        for(j = 0; j< haystack.length(); j++){
            if(haystack.charAt(j) != needle.charAt(j-i)){
                i=i+1;
                j=i;
            }
            if((j-i+1) == needle.length()){
                return i;
            }

        }
        return -1;
    }
}
