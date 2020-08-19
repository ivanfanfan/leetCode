package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int i = s.lengthOfLongestSubstring("aab");
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
        /**
         * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
         * 输入: "bbbbb"
         * 输出: 1
         * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
         * 示例 3:
         *
         * 输入: "pwwkew"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
         *
         */
        Set<Character> set = new HashSet<Character>();
        int i=0,j=0,maxLength=0;    //定义两个指针 i先走 j后走 maxlength记录最大值
        if(s.length()==0){
            return 0;
        }

        for(;i<s.length();i++){
            if(set.add(s.charAt(i))){
                maxLength = maxLength>set.size()?maxLength:set.size();
            }else{
                while(set.contains(s.charAt(i))){
                    if(set.remove(s.charAt(j)));
                    j++;
                }
                set.add(s.charAt(i));//这里因为上面加入字符由于里面有当前字符 所以没加进去，得重新加
            }
        }
        return maxLength;
    }
}
