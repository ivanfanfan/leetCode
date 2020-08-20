package leetcode;


//中心扩散
public class Solution5_1 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2){
            return s;
        }
        int start = 0;
        int maxlen = 1;
        char[] chars = s.toCharArray();
        for(int i = 0; i<len-1; i++){
            int oddLen = expandAroundCenter(chars,i,i);
            int evenLne = expandAroundCenter(chars,i,i+1);
            int curMaxlen = Math.max(oddLen,evenLne);
            if(curMaxlen>maxlen){
                maxlen = curMaxlen;
                start = i - (maxlen-1)/2;
            }

        }
        return s.substring(start,start+maxlen);
    }
//判断满足的回文字符 返回长度
    private int expandAroundCenter(char[] chars, int left, int right) {
        int len = chars.length;
        while(left>=0 && right<len && chars[right]==chars[left]){
            right++;
            left--;
        }
        return right-left-1;//跳出字符串正好 不满足
    }

}
