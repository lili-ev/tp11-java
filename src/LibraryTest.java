
public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("12345", "Java", "Ahmed");

        // Ajouter le livre
        library.addBook(book1);

        // Premier emprunt
        System.out.println("Premier emprunt : "
                + library.borrowBook(book1, "Sara"));

        // Tentative de deuxième emprunt
        System.out.println("Deuxieme emprunt : "
                + library.borrowBook(book1, "Youssef"));

        // Restitution du livre
        library.returnBook(book1);
        System.out.println("Livre restitue.");

        // Nouveau prêt après restitution
        System.out.println("Nouvel emprunt : "
                + library.borrowBook(book1, "Youssef"));
    }
}
