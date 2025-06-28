package array;

import java.util.Map;
import java.util.TreeMap;

public class ShiftingTargetNumberOrString {

    public static int[] shiftTargetNumberToRight(int[] arr, int target){
        int[] newArray = new int[arr.length];
        int countTarget = 0, i = 0 ;
        while(i < arr.length){
            if(arr[i] != target){
                newArray[countTarget] = arr[i];
                countTarget++;
            }
            i++;
        }
        while(countTarget < arr.length){
            newArray[countTarget++] = target;
        }

        return newArray;
    }
    public static void shiftingStringByNumber(String str, int shiftBy) {
//        char[] ch = str.toCharArray();
//        for()
    }

    public static  int[] shiftNumberDivisibleByThreeToRightInSorted(int[] arr){

        int[] tem = new int[arr.length];
        int count = 0, index = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 3 == 0){
                count++;
                map.put(arr[i], 0);
            } else {
                tem[index++] = arr[i];
            }
        }
        for(Map.Entry<Integer, Integer> ma : map.entrySet()){
            tem[index++] = ma.getKey();
        }

        return  tem;


    }
}
