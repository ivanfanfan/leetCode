package leetcode.s1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     */
    public static int[] getNumber(int arr[],int number){
        int a[]=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==number){
                    a[0]=arr[i];
                    a[1]=arr[j];
                    return a;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,9};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int i = scanner.nextInt();
            int[] number = getNumber(arr, i);
            if(number[0]>0){
                System.out.println(number[0]+"----"+number[1]);
            }else {
                System.out.println("没有");
            }
        }
    }


}
