public class Book {
   String Name;
   String Author;
    public Book(String Name,String Author){
        this.Author=Author;
        this.Name=Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Название книги: " + Name+", Автор - "+Author+ "\n";
    }
}
