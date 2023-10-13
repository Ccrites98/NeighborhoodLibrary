package com.pluralsight;
import java.util.*;


public class Library {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int HomeScreen = 0;
        int Choice;
        int CheckOut;
        int CheckIn = 0;
        String BooksInStock;
        String Name = "";


        //These the books I have on my desk, so it's a pretty weird library selection
        Books[] books = new Books[21];
        books[1] = new Books(1, "111-11-1111", "King Lear, by William Shakespeare", "", true);
        books[2] = new Books(2, "222-22-2222", "The Heart of a Woman, by Maya Angelou", "", true);
        books[3] = new Books(3, "333-33-3333", "Battlefield Earth, by L. Ron Hubbard", "", false);
        books[4] = new Books(4, "444-44-4444", "Another America; The Story of Liberia and the Former Slaves who Ruled it, by James Ciment", "", true);
        books[5] = new Books(5, "555-55-5555", "The Way of the Sufi, by Idries Shah", "", true);
        books[6] = new Books(6, "666-66-6666", "Islam in the School of Madina, by Ahmad Al-Qalawi Ash-Shinqiti", "", true);
        books[7] = new Books(7, "777-77-7777", "The Brothers Karamazov, by Fyodor Dostoevsky", "", true);
        books[8] = new Books(8, "888-88-8888", "Anna Karenina, by Leo Tolstoy", "", true);
        books[9] = new Books(9, "999-99-9999", "Malcolm X, by Alex Haley", "", false);
        books[10] = new Books(10, "101-10-1010", "Don Quixote, by Miguel de Cervantes", "", true);
        books[11] = new Books(11, "111-01-0000", "The Kingdom of God is Within You, by Leo Tolstoy", "", true);
        books[12] = new Books(12, "121-21-1212", "1984, by George Orwell", "", false);
        books[13] = new Books(13, "131-31-1313", "Fahrenheit 451, by Ray Bradbury", "", false);
        books[14] = new Books(14, "141-41-1414", "Philosophy and the Religions of India, by Yogi Ramacharaka", "", true);
        books[15] = new Books(15, "151-51-1515", "Negative Space, by B.R. Yeager", "", true);
        books[16] = new Books(16, "161-61-1616", "The Five Percenters; Islam, Hip Hop, and the Gods of New York, by Michael Muhammad Knight", "", true);
        books[17] = new Books(17, "171-71-1717", "How the Word is Passed, by Clint Smith", "", false);
        books[18] = new Books(18, "181-81-1818", "Africa's World War, by Gerard Prunier", "", true);
        books[19] = new Books(19, "191-91-1919", "Heart of Darkness, by Joseph Conrad", "", false);
        books[21] = new Books(20, "2020-20-2020", "Toward the African Revolution, by Frantz Fanon", "", true);
        //make it work jamie
        do {  //homescreen
            System.out.println("Hello and welcome to your local library!");
            keyboard.nextLine();
            System.out.println("Select an option: ");
            System.out.println("1.) Show Available Books.");
            System.out.println("2.) Show Checked Out Books.");
            System.out.println("0.) Quit.");
            Choice = keyboard.nextInt();


            HomeScreen = keyboard.nextInt();
            switch (HomeScreen) {
                case 1:
                    BooksInStock(Books);
                    break;
                case 2:
                    CheckOut(Books);
                    break;
                case 3:
                    System.exit(2);
            }
        }
        while (HomeScreen >= 0 && HomeScreen <= 2);
    }
    public static void availableBooks(Books[] book) {
        int HomeScreen = 1, id = 0;
        String Name = "";
        do {
            System.out.println("Currently in stock: ");
            for (int i = 0; i < book.length; i++) {
                if (!book[i].getIsCheckedOut()) {
                    System.out.println(book[i].toString());

                }
            }
            System.out.println("Select 1 to go back, Select 2 to Quit: ");
            HomeScreen = keyboard.nextInt();
            switch (HomeScreen) {
                case 1:
                    System.out.println("Input your name, please: ");
                    keyboard.nextLine();
                    Name = keyboard.nextLine();
                    System.out.println("Input the ID of the book you'd like to look up: ");
                    id = keyboard.nextInt();
                    for (int i = 0; i < book.length; i++) {
                        if (book[i].getId() == id) {
                            book[i].checkOut(Name);
                        }
                    }
            }
        }
    }
}