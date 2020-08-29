package leetcode.s20;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
public class Solution20 {
    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("()"));;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(!stack.isEmpty()&&((stack.peek()=='('&&ch==')') || (stack.peek()=='{'&&ch=='}') || (stack.peek()=='['&&ch==']'))){
                stack.pop();
            }
            else
                stack.push(s.charAt(i));
        }
        //为什么加个if else 比直接返回解决内存
        if(stack.isEmpty()){
            return true;
        }else
            return false;
    }
}
