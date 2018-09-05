package pl.sda.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();


        while (true) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Display books collection (no sort)");
            System.out.println("2. Add book to the collection");
            System.out.println("3. Delete book from the collection");
            System.out.println("4. Delete all books related to particular author");
            System.out.println("5. Display books collection sorted by title");
            System.out.println("6. Display books collection sorted by author");
            System.out.println("7. Display books collection sorted from worst to best");
            System.out.println("8. Display all books collection of particular author, sorted by title");
            System.out.println("9. Display all books collection of particular author, sorted by score");
            System.out.println();
            System.out.println("10. Take a batch of the book to the repository");
            System.out.println("11. Sell a book (take off from repository)");
            System.out.println("12. Display repository status per amount of books (Ascending)");
            System.out.println("13. Display status of the repository, where is less then 10, sorted by amount of books (Ascending)");
            System.out.println("14. End the program");


            int chosenOption = scanner.nextInt();
            scanner.nextLine();
            switch (chosenOption) {
                case 1:
                    bookStore.showBookCollection();
                    break;

                case 2:
                    System.out.println("Wprowadź nową książkę w formacie: Autor,Tytuł,ocena"); // TODO zadanie dodatkowe sprawić by można było dodać książkę bez oceny
                    String[] choppedBook = scanner.nextLine().split(",");
                    Book newBook = new Book(choppedBook[0], choppedBook[1], Double.parseDouble(choppedBook[2]));
                    bookStore.addBook(newBook);
                    break;
                case 3:
//                    System.out.println("Please enter the title of the book to remove it:");
//                    bookStore.deleteBook(scanner.nextLine());
//                    break;
                case 4:
                    System.out.println("Please enter the name of Author, all books related to him will be deleted:");
                    bookStore.deleteBooksByAuthor(scanner.nextLine());
                    break;

                case 14:
                    System.exit(200);

                default:
                    System.out.println("Wybrana została niepoprawna opcja, spróbuj ponownie");
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}