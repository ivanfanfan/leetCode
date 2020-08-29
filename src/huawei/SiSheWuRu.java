package huawei;

public class SiSheWuRu {

    public static void main(String[] args) {
        int a=(int)3.9;
        System.out.println(a);
    }
    public static int getSum(double f){
        //将小数变成整数
        int sum = (int)(f*10.0);
        //取出最后一位数判断大小 if大于5 取出整数除了最后一位+1 否则减1
        if(sum%10>=5){
            return sum = (sum-sum%10)/10+1;
        }else{
            return sum = (sum-sum%10)/10;
        }

    }
}
