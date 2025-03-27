import java.util.*;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (books.stream().anyMatch(b -> b.getId().equals(book.getId()))) {
            System.out.println("❌ Book ID already exists.");
            return;
        }
        books.add(book);
        System.out.println("✅ Book added.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        books.forEach(System.out::println);
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getId().equals(keyword) || book.getTitle().equalsIgnoreCase(keyword)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("❌ No matching book found.");
    }

    public void updateBook(String id, String title, String author, String genre, String status) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                if (!title.isEmpty()) book.setTitle(title);
                if (!author.isEmpty()) book.setAuthor(author);
                if (!genre.isEmpty()) book.setGenre(genre);
                if (status.equals("Available") || status.equals("Checked Out"))
                    book.setStatus(status);
                System.out.println("✅ Book updated.");
                return;
            }
        }
        System.out.println("❌ Book not found.");
    }

    public void deleteBook(String id) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                System.out.println("✅ Book deleted.");
                return;
            }
        }
        System.out.println("❌ Book not found.");
    }
}
