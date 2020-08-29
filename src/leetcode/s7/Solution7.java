package leetcode.s7;

/**
 *  public int reverse(int x) {
 *
 *     }
 *     假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 *     请根据这个假设，如果反转后整数溢出那么就返回 0
 */
public class Solution7 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new Solution7().reverse(Integer.MAX_VALUE));
    }
    public int reverse(int x) {
        /**
         * 取出x的 最后一个数字 放到新的树中
         */
        int rev = 0;

        while(x!=0){
            int pop = x%10;
            x /= 10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10&&pop>7))
                return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10&&pop<-8))
                return 0;
            rev=rev*10+pop;
        }
        return rev;
    }
}
