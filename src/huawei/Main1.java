package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        /**
         * 输入一个整数，将这个整数以字符串的形式逆序输出
         *
         * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        for (int i=s1.length-1;i>=0;i--) {
            if(i!=0)
                System.out.print(s1[i]+" ");
            else
                System.out.print(s1[i]);
        }


    }
}
