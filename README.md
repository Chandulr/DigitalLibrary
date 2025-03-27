# Digital Library Book Management System

## Objective

This is a Java-based command-line application designed to assist librarians in efficiently managing a digital library catalog. The system enables users to add, update, search, view, and delete book records, while ensuring each book has a unique ID and a valid availability status.

## Features

- Add a book with Book ID, Title, Author, Genre, and Availability Status
- View all books in the catalog
- Search for books by ID or Title
- Update book details (title, author, genre, status)
- Delete a book record from the catalog
- Exit the system from the menu

## Technologies Used

- Java SE (JDK 11+)
- Visual Studio Code (or any preferred Java IDE)
- Git for version control
- Command-line interface (CLI)

## Constraints

- Book ID must be unique
- Title and Author must be non-empty
- Availability Status must be either "Available" or "Checked Out"

## Assumptions

- The app runs in a terminal (console-based)
- Data is stored in memory using an ArrayList<Book>
- User inputs are expected to be plain text (no special symbols)
- Designed for a single user/librarian

- Sample Output

Digital Library Menu:
1. Add Book
2. View All Books
3. Search Book by ID or Title
4. Update Book
5. Delete Book
6. Exit
Enter your choice:

## Compile the Program
javac -d bin src/*.java

## Run the Application
java -cp bin Main

## Challenges Faced
Encoding issues (Cp1252 vs UTF-8) in Windows terminal
Ensuring unique Book IDs dynamically
Keeping logic simple yet scalable
Creating a smooth user input experience via CLI

## Improvements (Future Scope)

Add persistent storage (file or database)
Build a GUI version using JavaFX
Convert into a web application using Spring Boot
Add authentication and user roles (librarian/admin)
Extend with features like book borrowing/returning
