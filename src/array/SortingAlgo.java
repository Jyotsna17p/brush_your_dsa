package array;

import java.util.Arrays;

public class SortingAlgo {


    //Two Pointer using 3rd array
    public static void mergeSortedArray(int[] arr1, int[] arr2){
        int l1= arr1.length;
        int l2 = arr2.length;
        int[] temp = new int[l1+l2];
        int f = l1 -1;
        int s = l2- 1;
        int t = l1+l2 -1;
        for(int i = 0 ; i < arr1.length;i++){
            temp[i]= arr1[i];
        }
        while(f>=0 && s >= 0){
            if(arr2[s] > arr1[f]){
                temp[t] = arr2[s];
                t--;
                s--;
            }else {
                temp[t] = arr1[f];
                t--;
                f--;
            }
        }
        for(int j : temp){
            System.out.println(" = " + j);
        }
    }
    //Two Pointer without using 3rd array
    public static void mergeSortedArray(int[] arr1, int[] arr2, int m , int n){

        int f = m -1;
        int s = n- 1;
        int t = m+n -1;
        while(f>=0 && s >= 0){
            if(arr2[s] > arr1[f]){
                arr1[t] = arr2[s];
                t--;
                s--;
            }else {
                arr1[t] = arr1[f];
                t--;
                f--;
            }
        }
        for(int j : arr1){
            System.out.println(" + " + j);
        }
    }

    public static  void sortArrayUsingBubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length -1 ; i++){
            boolean isSwapped = false;
            for(int j = 0 ; j < arr.length-1-i ;j++){
                if(arr[j] > arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                 isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
        System.out.println("Bubble Sort : ");
        for(int n : arr){
            System.out.println(n);
        }

    }

}
