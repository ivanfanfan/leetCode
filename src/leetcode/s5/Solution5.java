package leetcode.s5;

/**
 * 回文最大子串  暴力破解
 */
public class Solution5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();//以上两个常量的增加 加快了程序运行的速度
        if(s.length()<2){
            return s;
        }

        int maxLength = 1;
        int start = 0;
        for(int i = 0; i<len-1;i++){
            for(int j = i+1; j<len;j++){
                if(j-i+1>maxLength && validPalindrome(charArray,i,j)){
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start,start+maxLength);
    }

    /**
     * 判断是否是回文字符串
     * @param charArray
     * @param left
     * @param right
     * @return
     */
    public boolean validPalindrome(char[] charArray,int left,int right){

        while(left<right){
            if(charArray[left]!=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
