package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) throws IOException {
        /**
         * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，
         * 假如兔子都不死，问每个月的兔子总数为多少？
         *
         *
         *
         * * 统计出兔子总数。
         * *
         * * @param monthCount 第几个月
         * * @return 兔子总数
         *
         *public static int getTotalCount ( int monthCount)
         *{
         *return 0;
         *}
         *hhh
         *本题有多组数据，请使用while(cin >> ) 读取
         */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            System.out.println(getTotalCount(input));
        }
    }

    public static int getTotalCount ( int monthCount){
        //第一只 monthCount后 变成 monthCount-3只
        //第二只
        int a=1,b=0,c=0;
        while (--monthCount>0){
            c+=b;
            b=a;
            a=c;
        }
        return a+b+c;
    }
}
