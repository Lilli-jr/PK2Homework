package Exercise3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mail {
    private String sender;
    private String subject;
    private String message;
    private LocalDateTime dateTime;
    private boolean isRead;

    public Mail (String sender, String subject, String message, LocalDateTime dateTime, boolean isRead) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime;
        this.isRead = false;
    }
    public void markAsRead() {
        this.isRead = true;
    }
    public boolean isRead(){
        return isRead;
    }
    public void printFormatted(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("From: " + sender + " on " + dateTime.format(formatter) + " : " + subject);
        System.out.println("Message: " + message);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }
}
