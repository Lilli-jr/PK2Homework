package Exercise1;

public class Textbook extends Book{
    public String subject;

    public Textbook(String title, int year, String author, String subject) {
        super(title, year, author);
        this.subject = subject;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + ", Subject: " + subject;
    }
}
