package leetcode;

/**
 * 判断是否是回文数 2020年8月23日21:26:20
 * 效率太低！！！！！！！！！！！
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if(x!=0&&(x%10==0||x<0)){
            return false;
        }
        char[] str = (x+"").toCharArray();
        int j=str.length-1;
        for(int i=0;i<str.length;i++){
            if(str[i]!=str[j])
                return false;
            if(str[i]==str[j]&&j<=i)
                return true;
            j--;
        }
        return false;

    }

}
