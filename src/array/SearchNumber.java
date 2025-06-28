package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SearchNumber {

    public static int returnIndexOfElement(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],i));
        }
        return map.containsKey(target) ? map.get(target) : -1;
        // equivalent to same above
        //return map.getOrDefault(target, -1);
    }

    public static int findLargestNumber(int[] arr){
        int max  = -1;
        for(int n : arr){
            if(n > max){
                max = n;
            }
        }
        return max;
    }
    public static int findSecondLargestNumber(int[] arr){
        int max1  = - 9999;
        int max2 =  -9999;
        for(int n : arr){
            if(n > max1 ){
               max2 = max1;
                max1 = n;
            }
            else if(n > max2){
                max2 = n;
            }
        }
        return max2;
    }

}
