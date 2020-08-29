package leetcode.s1;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//        示例:
//        给定 nums = [2, 7, 11, 15], target = 9
//
//        因为 nums[0] + nums[1] = 2 + 7 = 9
//        所以返回 [0, 1]

public class Main_1_1 {
    public static void main(String[] args) throws IOException {


        int arr[]={2,5,7,9};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int i = scanner.nextInt();
            int[] number = twoSum(arr, i);
            if(number!=null) {
                System.out.println(number[0]);
                System.out.println(number[1]);
            }else{
                System.out.println("没有");
            }

        }

    }
    public static int[] twoSum(int[] arr, int target) {

        Map<Integer,Integer>  map = new HashMap<Integer,Integer>();
        for(int i = 0;i<arr.length;i++){
            int number = target-arr[i];
            if (map.containsKey(number)) {
                return new int[]{map.get(number),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return null;
    }
}
