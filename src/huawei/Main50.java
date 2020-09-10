package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main50 {
    public static void main(String[] args) {
        List<Character> calculates = calculate("9+5*2+3-6/3");
        for (Character calculate : calculates) {
            System.out.print(calculate);
        }
    }


    public static List<Character> calculate(String strExpression) {


        /**
         * 先将中缀表达式转化成后缀表达式
         *      定义两个栈 一个存储数字 一个存储符号
         *      1.扫描string
         *      2如果是数字直接存入数字栈中，
         *      3如果是符号进行比较优先级
         *          3.1 符号优先级小于或者等于 栈顶元素 ，栈顶元素弹出
         *          3.2 符号优先级大于栈顶元素， 加入栈中
         *          3.3 如果遇到左括号 push进栈，直到遇到右括号将栈中所有符号弹出
         * 使用后缀表达式进行计算
         */
        List<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < strExpression.length();i++){

            //扫描字符串 数字0=48 9=57
            if(strExpression.charAt(i)>=48&&strExpression.charAt(i)<=57){
                list.add(strExpression.charAt(i));
            }
            //这里开始就是符号
            if(strExpression.charAt(i)=='('){
                stack.push(strExpression.charAt(i));
            }else if (strExpression.charAt(i)==')'){
                while (stack.peek()!='('){
                    list.add(stack.pop());
                }
            }
            if(stack.isEmpty()){
                stack.push(strExpression.charAt(i));
            }else {
                while(!stack.isEmpty()&&getOperator(strExpression.charAt(i))<=stack.peek()){
                    list.add(stack.pop());
                }
            }
        }

        return list;

    }
    public static int getOperator(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }
        return 0;
    }
}
