package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 没结果
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        //输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        String[] s1 = new String[i];
        for(int n=0; n<s1.length; n++){
            s1[n]=bufferedReader.readLine();
        }
        for(int j=0; j<s1.length; j++){
            for(int k=j+1; k<s1.length-1;k++){
                for(int m=0;m<(s1[j].length()<s1[k].length()?s1[j].length():s1[k].length()); m++){
                    System.out.println(m+"m");
                    if(s1[j].charAt(m)>s1[k].charAt(m)){
                        System.out.println(s1[j].charAt(m)+"-----"+s1[k].charAt(m));
                        String str = s1[j];
                        s1[j] = s1[k];
                        s1[k] = str;
                    }
                }

            }
        }
        for(int j=0;j<s1.length; j++){
            System.out.println(s1[j]);
        }
        /**
         * 9
         * cap
         * to
         * cat
         * card
         * two
         * too
         * up
         * boat
         * boot
         */
        /**
         * boat
         * boot
         * cap
         * card
         * cat
         * to
         * too
         * two
         * up
         */
    }
}
