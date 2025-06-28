package array;

import javax.xml.stream.XMLInputFactory;

public class SearchingAlgo {

    public static void linearSearch(int[] arr , int searchNumber){
        boolean numberFound = false;
        for(int n : arr)
        {
            if(n == searchNumber){
                numberFound = true;
                break;
            }
        }
       if(numberFound){
           System.out.println("Number Found");
       } else {
           System.out.println("Number Not Found");
       }
    }

    // Alwasys work on sorted array;
    public static void binarySearch(int[] arr , int number){
        boolean found  = false;
        int low = 0, high = arr.length-1;
        while(low < high){
            int mid = (low +high)/2;
            if(arr[mid] == number) {
                found =  true;
                break;
            }
            if(number > arr[mid]){
                low = mid+1 ;
            }else {
                high = mid -1;
            }
        }
        if(found){
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }
    }
    // Alwasys work on sorted array;
    public static void binarySearchUsingRecuurion(int[] arr , int number){
        int low = 0, high = arr.length-1;

        boolean found  = search(arr,low,high,number);
        if(found){
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }
    }

    public static boolean search(int[] arr, int low, int high, int number){

            if(low > high) return false;
            int mid = (low +high)/2;
            if(arr[mid] == number) {
               return true;
            } else if(number > arr[mid]){
                return search(arr, mid +1 , high, number);
            }else {
                return search(arr, low, mid-1, number);
            }
    }
}
