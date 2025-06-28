import array.*;
import designpatters.creational.abstractt.Burger;
import designpatters.creational.abstractt.Drink;
import designpatters.creational.abstractt.IndianKitchen;
import designpatters.creational.abstractt.MealFactory;
import designpatters.creational.builder.Pizza;
import designpatters.creational.factory.CreateFile;
import designpatters.creational.factory.CreateFileFactory;
import designpatters.creational.singleton.Singleton;
import streams.Department;
import streams.Emp;
import streams.Employee;
import streams.StreamApiExample;

import java.util.ArrayList;
import java.util.List;




public class Main {
    public static void main(String[] args) {

        //checkPalindrome();
         //shiftingTargetNumberRight();
        //searchElementInArrayAndReturnIndex();
       // printingOddAndEvenNumbersUsingTwoThreads();
        //shiftingStringByNumber("abc", 3);
        //searchNumber();
       // removeDuplicate();
        //stringManipulation();
   //     sortingArray();
   //     findKLargestAndSmallestElement();

//        singletonClassThreadSafety();
//        factoryClassImplemenatation();
//        builderClassImplement();
//        abstractFactoryImplement();
         streamApiExample();
       // validateIpAddress();

    }

    private static void validateIpAddress() {
            String stt = StringManipulation.validIPAddress("192.169.09.1");
            System.out.println("IP - : " +stt);
    }

    private static void streamApiExample() {
        List<Employee> employeeList = new ArrayList<>();
        Department d1 = new Department("1","IT");
        Department d2 = new Department("2","CS");

        employeeList.add(new Employee("11","Ram", d1, "female", 10.0));
        employeeList.add(new Employee("12","Rami", d1, "female", 20.0));
        employeeList.add(new Employee("13","Sham", d2, "female", 20.0));
        employeeList.add(new Employee("14","Tam", d1, "male", 10.0));
        employeeList.add(new Employee("15","Kam", d2, "male", 30.0));

       // StreamApiExample.groupByExample(employeeList);

        StreamApiExample.streamExample();
        StreamApiExample.streamExample1(employeeList);

        List<Emp> employees = new ArrayList<>();

        employees.add(new Emp(1, "Alice", 0, "HR", 60000));
        employees.add(new Emp(2, "Bob", 1, "HR", 55000));
        employees.add(new Emp(3, "Charlie", 1, "Engineering", 75000));
        employees.add(new Emp(4, "David", 3, "Engineering", 70000));
        employees.add(new Emp(5, "Eve", 3, "Engineering", 72000));
        employees.add(new Emp(6, "Frank", 1, "Sales", 50000));

        StreamApiExample.streamExmaple2(employees);
    }

    private static void findKLargestAndSmallestElement() {
             int[] arr= {1,1,2,2,3,5,8,9};

             int kLarget = 3;
            TopKElement.findTopKLargetNumber(arr,kLarget);
            TopKElement.findTopKSmallestNumber(arr,kLarget);
    }

    private static void abstractFactoryImplement() {
        MealFactory mealFactory = new IndianKitchen();
        Burger burger = mealFactory.createBurger();
        Drink drink = mealFactory.drink();
        burger.createBurger();;
        drink.drink();
    }

    private static void builderClassImplement() {
        Pizza pizza = new Pizza.PizzzBuilder("Large").addCheese(true).addMushroom(false).build();
        System.out.println("Builder = " +  pizza);
    }

    private static void factoryClassImplemenatation() {
        CreateFileFactory createFileFactory = new CreateFileFactory();
        CreateFile  createFile = createFileFactory.getFileType("excel");
        createFile.createFile();
    }

    private static void singletonClassThreadSafety() {

        Runnable r1 = Singleton::getInstance;
        Runnable r2 = Singleton::getInstance;
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        System.out.println("Singelton class obj : "+ r1);
        t2.start();
        System.out.println("Singelton class obj : "+ r2);

    }

    private static void sortingArray() {
        int[] arr1= {1,2,3,4};
        int[] arr2= {1,2};
        SortingAlgo.mergeSortedArray(arr1, arr2);
        SortingAlgo.mergeSortedArray(new int[]{1,2,3,0,0},new int[]{1,2},3,2);
        SortingAlgo.sortArrayUsingBubbleSort(new int[]{2,5,8,1,3,5});
    }

    private static void stringManipulation() {
        StringManipulation.reverseString("hello");
    }

    private static void removeDuplicate() {
        int[] arr= {1,1,2,2,3,5,8,9};
        RemoveDuplicate.removeDuplicate(arr);
        RemoveDuplicate.occracnceOfNumber(arr);
        RemoveDuplicate.calculateUniqueNumbers(arr);
        String sentence = "this is paragraph, this is so good this";
        RemoveDuplicate.occracnceOfString(sentence);
    }

    private static void searchNumber() {
        int[] arr= {1,1,2,2,3,5,8,9};
        int target = 91;
        SearchingAlgo.linearSearch(arr,target);
        SearchingAlgo.binarySearch(arr,target);
        SearchingAlgo.binarySearchUsingRecuurion(arr, target);


    }

    private static void shiftingStringByNumber(String str, int shiftBy) {
            ShiftingTargetNumberOrString.shiftingStringByNumber(str, shiftBy);
    }

    private static void searchElementInArrayAndReturnIndex() {
        int[] arr= {1,2,3,5,8,0};
        int target = 11;
        int index = SearchNumber.returnIndexOfElement(arr, target);
        System.out.println("Index Of Searched Array : = " + index);
        System.out.println("LargestNumber - " + SearchNumber.findLargestNumber(arr));
        System.out.println("Second LargestNumber - " + SearchNumber.findSecondLargestNumber(arr));
    }

    private static void shiftingTargetNumberRight() {
        int[] arr= {1,2,3,2,1,3,1};
        int[] newa = ShiftingTargetNumberOrString.shiftTargetNumberToRight(arr, 1);
        System.out.println("Shifted array : = ");

        for (int n : newa){
            System.out.println(n);
        }

        int x = 0;
        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] > arr[x]){
                x = x+1;
                arr[x] = arr[i];
            }
        }
        System.out.println("-" + x+1);

        int[] a = { 10, 4, 6, 3, 5, 12, 9, 5, 7 };
        int[] res = ShiftingTargetNumberOrString.shiftNumberDivisibleByThreeToRightInSorted(a);
        for(int n : res){
            System.out.println(n);
        }
    }

    private static void checkPalindrome() {
        int number  =  100;
        PallindromeCheck.checkPallindromeUsingTwoPointer(number, "hello");
        PallindromeCheck.isNumberPallindrome(number);
    }

    private static void printingOddAndEvenNumbersUsingTwoThreads() {
        EvenOddPrinter evenOddPrinter = new EvenOddPrinter(30,10);
        Runnable r1 = () -> {
            try {
                evenOddPrinter.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable r2 = () -> {
            try {
                evenOddPrinter.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t1 = new Thread(r1, "EVEN");
        Thread t2 = new Thread(r2, "ODD");
        t2.start();
        t1.start();
    }
}