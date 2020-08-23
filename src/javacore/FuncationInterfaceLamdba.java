package javacore;

import java.util.Comparator;

public class FuncationInterfaceLamdba {

    public static Comparator<String> getComparetor(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1,String o2) {
//                return o2.length()-o1.length();
//            }
//        };

        //方法的返回值是一个函数式接口，使用Lambda表达式
//        return (String o1,String o2)->{
//          return o2.length()-o1.length();
//        };


        return (o1,o2)->o2.length()-o1.length();

    }
}
