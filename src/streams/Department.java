package streams;

public class Department {
    private String id;
    private String deparmentName;

    public Department(String id, String deparmentName) {
        this.id = id;
        this.deparmentName = deparmentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }
}
