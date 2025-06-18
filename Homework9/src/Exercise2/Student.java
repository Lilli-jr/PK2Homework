package Exercise2;

public class Student {
    private String name;
    private int year;
    private String major;

    public Student(String major, String name, int year) {
        this.major = major;
        this.name = name;
        this.year = year;
    }

    public String getName() { return name;}
    public int getYear() { return year;}
    public String getMajor() { return major;}
}
