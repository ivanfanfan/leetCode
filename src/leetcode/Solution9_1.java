package leetcode;

public class Solution9_1 {

    public static void main(String[] args) {
        int x=123;
        String str = String.valueOf(123);
        System.out.println(str);
    }
    public boolean isPalindrome(int x) {
        if(x!=0&&(x<0||x%10==0)){
            return false;
        }
        int rev = 0;
        while(x>rev){
            rev = rev*10+x%10;
            x/=10;
        }
        return rev==x || rev/10==x;
    }
}
