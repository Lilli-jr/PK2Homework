package Exercise2;

public class Main5 {
    public static void main(String[] args) {
        Student s1 = new Student("Physics", "Anna", 2);
        Student s2 = new Student("Mathe", "Benno", 3);

        StudentFormatter basicFormat = student -> "Student " + student.getName() + ", Year " + student.getYear();

        StudentFormatter detailed = student -> student.getName() + " studies " + student.getMajor() + " in Year " + student.getYear();

        System.out.println(basicFormat.format(s1));
        System.out.println(basicFormat.format(s2));
        System.out.println(detailed.format(s1));
        System.out.println(detailed.format(s2));
    }
}
