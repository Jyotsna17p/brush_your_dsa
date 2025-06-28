package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void groupByExample(List<Employee> employee){

        //Group a list of objects by an attribute like gender
        Map<String, List<Employee>> map = employee.stream()
                .collect(Collectors.groupingBy(Employee::getGender));

        Map<String, List<String>> map1 = employee.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));


        Map<String, List<String>> map2 = employee.stream().filter(data -> data.getDepartment().getDeparmentName().equals("IT"))
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));

        Map<String, Long> map3 = employee.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment().getDeparmentName(), Collectors.counting()));
        Map<String, List<Employee>> map4 = employee.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment().getId()));

        Map<String, Double> map5 = employee.stream()
                .collect(Collectors.groupingBy(em -> em.getDepartment().getDeparmentName(), Collectors.averagingDouble(Employee::getSalary)));

        Map<String, Employee> map6= employee.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println("Stream group By : "+ map );
        System.out.println("Stream group By : "+ map1 );
        System.out.println("Stream group By : "+ map2 );
        System.out.println("Stream group By : "+ map3 );
        System.out.println("Stream group By : "+ map4 );
        System.out.println("Stream group By : "+ map5 );
        System.out.println("Stream group By : "+ map6 );

    }

    public static  void streamExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,0);
        System.out.println(numbers.stream().distinct().sorted().toList());

        numbers = numbers.stream().filter(n-> n%2 ==0).toList();
        System.out.println(numbers);
        numbers = numbers.stream().distinct().toList();
        System.out.println(numbers);
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        names = names.stream().map(n -> {
                    char c = n.charAt(0);
                    String str = String.valueOf(c).toUpperCase();
                    str = str + n.substring(1, n.length());
                    return str;
                }
           ).toList();
        System.out.println(names);
        names = names.stream().map(n -> n.toUpperCase()).toList();
        System.out.println(names);


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30000.0),
                new Employee("Alice2", 60000.0),
                new Employee("Alice1", 60000.0),
                new Employee("Bob", 25000.0),
                new Employee("Charlie", 400.0)
        );

        employees = employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary(), Comparator.reverseOrder())).toList();
        System.out.println(employees);

        Double secondHighestSalary = employees.stream().skip(2).findFirst().get().getSalary();
        System.out.println(secondHighestSalary);



        Map<Double, Long> map  = employees.stream().collect(Collectors.groupingBy(employee -> employee.getSalary(), Collectors.counting()));
        System.out.println(map);

        List<String> empName = employees.stream().filter(employee -> employee.getSalary() > 20000).map(Employee::getName).toList();
        System.out.println(empName);


        String str = "javisgood";
        Map<String, Long> countMpa = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMpa);
    }


    public static void streamExample1(List<Employee> employeeList) {
        Map<String, List<Employee>> emp   = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment().getDeparmentName()));
        System.out.println(emp);
        Map<String, Long> emp1=  employeeList.stream().collect(Collectors.groupingBy(eem -> eem.getDepartment().getDeparmentName(), Collectors.counting()));
        System.out.println(emp1);

    }
}
