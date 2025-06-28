package streams;

public class Emp {
    int id ;
    String name;
    int supervisorId;
    String department;
    int salary;

    public Emp(int id, String name, int supervisorId, String department, int salary) {
        this.id = id;
        this.name = name;
        this.supervisorId = supervisorId;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", supervisorId=" + supervisorId +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
