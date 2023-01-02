public class Book {
   String name;
   String author;
    public Book(String Name,String Author){
        this.author=Author;
        this.name=Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название книги: " + name+", Автор - "+author+ "\n";
    }
}
