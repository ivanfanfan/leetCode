package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转阿拉伯数字
 * 效率太低
 */
public class Solution13 {

    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        System.out.println(s.length());
        int sum = 0;
        int preNum = map.get(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(preNum<map.get(s.charAt(i)))
                sum -= preNum;
            else
                sum += preNum;
            preNum = map.get(s.charAt(i));
        }
        return sum+preNum;
    }
}
