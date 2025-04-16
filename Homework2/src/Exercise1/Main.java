package Exercise1;

public class Main {
    public static void main(String[] args) {
        Publication publication = new Publication("Scientific Article", 2023);
        System.out.println(publication.getInfo());

        Book book = new Book("The Great Novel", 2024, "Jane Doe");
        System.out.println(book.getInfo());

        Textbook textbook = new Textbook("Advanced Physics", 2022, "John Smith", "Physics");
        System.out.println(textbook.getInfo());
    }
}
