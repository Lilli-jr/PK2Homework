package Exercise3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();

        Mail mail1 = new Mail("alice@example.com", "Meeting Reminder", "Don't forget the meeting tomorrow!", LocalDateTime.now().minusDays(2), false); // Added false
        Mail mail2 = new Mail("bob@example.com", "Project Update", "Here's the latest project update.", LocalDateTime.now().minusHours(5), false); // Added false
        Mail mail3 = new Mail("charlie@example.com", "Important Announcement", "Company-wide announcement.", LocalDateTime.now(), false); // Added false
        Mail mail4 = new Mail("david@example.com", "Re: Meeting Reminder", "Regarding tomorrow's meeting...", LocalDateTime.now().minusDays(1), false); // Added false

        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);
        inbox.addMail(mail4);

        mail1.markAsRead();
        mail3.markAsRead();

        System.out.println("Number of unread emails: " + inbox.countUnread());

        System.out.println("\nOpening email at index 1:");
        inbox.open(1);

        System.out.println("\nOpening email at index 5:");
        inbox.open(5); // Invalid index

        System.out.println("\nAll Email Headers:");
        inbox.printAllHeaders();
    }
}
