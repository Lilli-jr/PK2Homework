package Exercise1;

public enum CoursePhase {
    NOT_STARTED("Course not started yet"),
    ONGOING("Course is in progress"),
    FINISHED("Course had ended");

    private String message;

    CoursePhase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
