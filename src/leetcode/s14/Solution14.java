package leetcode.s14;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 * 2020年8月24日01:59:08
 *
 *
 * 思考大于代码
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        //遍历数组中第一个字符串的字符 挨个遍历所有数组中第n个元素 n为第一个字符串的字符角标
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length()&&strs[0].charAt(i)==strs[j].charAt(i)){
                    continue;
                }else {
                    if(i==0){
                        return "";
                    }else {
                        return strs[0].substring(0,i);
                    }
                }
            }
        }
        return strs[0];
    }
}
