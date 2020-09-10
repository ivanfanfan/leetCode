package javacore;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int num = getNum(next);
        System.out.println(num);

    }
    public static int getNum(String string){
        Stack<Character> stack = new Stack<>();

        Map<Character,Character> map = new HashMap<>();
        map.put('<','>');
        map.put('>','<');
        map.put('{','}');
        map.put('}','{');
        map.put('[',']');
        map.put(']','[');
        int count = 0;
        for(int i= 0;i<string.length();i++){
            if(string.charAt(i) == '<' ||
                    string.charAt(i)=='{' ||
                    string.charAt(i) == '['||
                    string.charAt(i) == '>'||
                    string.charAt(i) == '}'||
                    string.charAt(i) == ']'
            )       {
                if(!stack.isEmpty() && map.get(string.charAt(i)) == stack.peek() && (string.charAt(i) == '>' ||
                        string.charAt(i)=='}' ||
                        string.charAt(i) == ']')){
                    stack.pop();
                    count ++;
                }else {
                    stack.push(string.charAt(i));
                }

            }
        }
        if(stack.size()==0){
            return count;
        }else {
            return  0;
        }
    }


}
