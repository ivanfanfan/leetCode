package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
public class Main {
    public static void main(String[] args) throws IOException {
        //输入一个int
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
//        计算二进制数
        int count=0; //计数器
        while(true){
            int n = i%2;//取余
            if(n==1){
                count++;
            }
            i = i/2;
            if(i==1){
                count++;
                break;
            }
        }
        System.out.println(count);
    }
    //使用递归

}
