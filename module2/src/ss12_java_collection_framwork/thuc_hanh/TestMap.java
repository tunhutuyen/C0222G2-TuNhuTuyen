package ss12_java_collection_framwork.thuc_hanh;

import java.util.*;


public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Anh",20);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Lewis44444", 41);
        System.out.println("hashmap là:");
        System.out.println(hashMap+"\n");
        // sắp xếp theo tên
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("treemap là: ");
        System.out.println(treeMap+"\n");


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
