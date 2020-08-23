package javacore;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Stream;

/**
 * 所有的Collection集合都可以通过Stream默认方法获取
 * default Stream<E> Stream()
 *
 * Stream 接口的静态方法of可以获取数组对应的流
 *  static<T> Stream<T> of(T....values)
 *  参数如果是一个可变参数，那么就可以传递一个数组
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();
        //获取值
        Collection<String> collection = map.values();
        Stream<String> stream3 = collection.stream();
        //获取键值对
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //把数组转换成Stream流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5);
        String[] arr = {"a","b","c"};
        Stream<String> arr1 = Stream.of(arr);


    }
}
