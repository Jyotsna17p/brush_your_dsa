package array;

import java.awt.desktop.SystemEventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

    public static void calculateUniqueNumbers(int[] arr){
        //Using Set
        Set<Integer> sett = new HashSet<>();
        for(int n : arr){
            sett.add(n);
        }
      System.out.println(sett.size());
    }
    public static void removeDuplicate(int[] arr){
        Set<Integer> sett = new HashSet<>();
        for(int n : arr){
            sett.add(n);
        }
        int[] arr1 = new int[sett.size()];
        int i = 0;
        for(int x : sett){
            arr1[i++] = x;
            System.out.println(x);
        }

    }

    public static void occracnceOfNumber(int[] arr){
        Map<Integer,Integer> map  = new HashMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        map.forEach((k,v)-> System.out.println( k + "-" + v));

    }

    public static void occracnceOfString(String str){
        Map<String,Integer> map  = new HashMap<>();
        if(str.contains(",") || str.contains(":"))
            str = str.replaceAll("[^a-zA-Z]]","");
        String[] stAr = str.split(" ");
        for(String n : stAr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        map.forEach((k,v)-> System.out.println( k + "-" + v));
    }
}
