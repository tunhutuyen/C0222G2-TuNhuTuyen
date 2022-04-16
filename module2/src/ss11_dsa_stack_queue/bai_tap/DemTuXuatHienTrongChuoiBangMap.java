package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.*;
import java.util.TreeMap;

public class DemTuXuatHienTrongChuoiBangMap {
    public static void main(String[] args) {
        String string = "Còn gì nữa đâu mà kHóC vớI Sầu, Còn gì Nữa đâu mà buồn với NHớ ";
        string = string.replaceAll(",","");
        String[] arr = string.trim().toLowerCase().split(" ");

        String key;
        Integer value;
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for(int i=0;i<arr.length;i++){
            key = arr[i];
            if(map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, value+1);
            } else{
                map.put(key, 1);
            }
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
//        Set set=map.keySet();
//        Iterator i = set.iterator();
//
//        while(i.hasNext()){
//            key=(String)i.next();
//            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
//        }

    }
}
