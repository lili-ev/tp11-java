
public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book(
            "978-2123456803",
            "Java Avancé",
            "Auteur A"
        );

        // Ajouter le livre
        lib.addBookIndexed(b1);

        // Emprunter le livre
        lib.borrowBook(b1, "Alice");

        // Rechercher le livre par ISBN
        System.out.println(
            "Livre trouvé par ISBN : "
            + lib.findByIsbn("978-2123456803")
        );
    }
}
