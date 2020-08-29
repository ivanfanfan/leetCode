package javacore.recursion;

public class Recursion1001 {
    public static void main(String[] args) {
        int num = new Recursion1001().getNum(100);
        System.out.println(num);
    }
    public int getNum(int a){
        if(a==0){
            return 0;
        }
        return a+getNum(a-1);

    }
}
