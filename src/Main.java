import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n📚 Digital Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Status (Available/Checked Out): ");
                    String status = scanner.nextLine();

                    if (title.isEmpty() || author.isEmpty() ||
                            (!status.equals("Available") && !status.equals("Checked Out"))) {
                        System.out.println("❌ Invalid input.");
                    } else {
                        library.addBook(new Book(id, title, author, genre, status));
                    }
                    break;

                case "2":
                    library.viewBooks();
                    break;

                case "3":
                    System.out.print("Enter Book ID or Title: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;

                case "4":
                    System.out.print("Enter Book ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("New Title (leave blank to skip): ");
                    String newTitle = scanner.nextLine();
                    System.out.print("New Author (leave blank to skip): ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("New Genre (leave blank to skip): ");
                    String newGenre = scanner.nextLine();
                    System.out.print("New Status (Available/Checked Out): ");
                    String newStatus = scanner.nextLine();

                    library.updateBook(updateId, newTitle, newAuthor, newGenre, newStatus);
                    break;

                case "5":
                    System.out.print("Enter Book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    library.deleteBook(deleteId);
                    break;

                case "6":
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }
        } while (!choice.equals("6"));

        scanner.close();
    }
}
