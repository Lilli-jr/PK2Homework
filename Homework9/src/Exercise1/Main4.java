package Exercise1;

public class Main4 {
    public static void main(String[] args) {
        for(CoursePhase phase : CoursePhase.values()) {
            System.out.println(phase + ": " + phase.getMessage());
        }
    }
}
