import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Book book1 = new Book("Война и Мир","Л.Н. Толстой");
    Book book2= new Book("Преступление и наказание","Ф.М. Достоевский");
    Book book3 = new Book("Идиот", "Ф.М. Достоевский");
    Book[] booksArray = {book1,book2,book3};
        for (int i = 0; i < booksArray.length; i++) {
            System.out.print(booksArray[i]);
        }
    }
}