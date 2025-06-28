package array;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class TopKElement {

    public static void findTopKLargetNumber(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

      for(int n : arr){
          priorityQueue.add(n);
          if(priorityQueue.size() > k){
              priorityQueue.poll();
          }
      }

        System.out.println("K largets elemnet : " + priorityQueue);
    }
    public static void findTopKSmallestNumber(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : arr){
            priorityQueue.add(n);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }

        System.out.println("K Smallest elemnet : " + priorityQueue);
    }
//    public static void findTopKLargetNumbe(String[] arr, int k){
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(String n : arr){
//            priorityQueue.add(n);
//            if(priorityQueue.size() > k){
//                priorityQueue.poll();
//            }
//        }
//
//        System.out.println("K Smallest elemnet : " + priorityQueue);
//    }
//    public static void findTopKSmallestNumber(String[] arr, int k){
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(String n : arr){
//            priorityQueue.add(n);
//            if(priorityQueue.size() > k){
//                priorityQueue.poll();
//            }
//        }
//
//        System.out.println("K Smallest elemnet : " + priorityQueue);
//    }
}
