import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) throws IOException {
        /**
         *有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
         * 她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
         * 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，
         * 喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
         *
         * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），
         * 表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
         */
        /**
         * 思路
         * 1.n%3 换完最后剩下的瓶子
         *   n/3 换的水
         *   n%3+n/3总共的水瓶
         *   n
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i;
        while ((i=Integer.parseInt(bufferedReader.readLine()))!=0&& i<=100){
            arrayList.add(i);
            if(arrayList.size()>=10&&Integer.parseInt(bufferedReader.readLine())==0){
                break;
            }
        }
        for(int j=0; j<arrayList.size(); j++){
            int x=arrayList.get(j);
            int count = 0;
            while (true){
                if(x==2){
                    count++;
                    break;
                }else if(x<2){
                    break;
                }else{
                    count+=x/3;
                    x=x/3+x%3;
                }
            }
            System.out.println(count);
        }

    }
}
