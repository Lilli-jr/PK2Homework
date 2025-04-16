package Exercise3;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Inbox {
    private List<Mail> mails;
    public Inbox() {
        this.mails = new ArrayList<>();
    }
    public void addMail(Mail mail) {
        this.mails.add(mail);
    }
    public void printAllHeaders(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Sender | Subject | DateTime | Read");
        System.out.println("-------------------------------");
        for(Mail mail : mails){
            System.out.printf("%s | %s | %s | %s%n", mail.getSender(), mail.getSubject(), mail.getDateTime().format(formatter), mail.isRead() ? "Yes" : "No");
        }
    }
    public void open(int index){
        if(index >= 0 && index < mails.size()){
            mails.get(index).printFormatted();
            mails.get(index).markAsRead();
        } else {
            System.out.println("Invalid index");
        }
    }
    public int countUnread(){
        int count = 0;
        for(Mail mail : mails){
            if(!mail.isRead()){
                count++;
            }
        } return count;
    }
}
