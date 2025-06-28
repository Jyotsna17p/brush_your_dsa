package streams;

public class Employee {

    private String id;
    private String name;
    private Department department;
    private String gender;
    private Double salary;

    public Employee(String id, String name, Department department, String gender, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(String name , Double salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

