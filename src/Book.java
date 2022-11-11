import javax.swing.text.ParagraphView;

public class Book implements Printable{
    private String nameOfBook;
    public Book (String nameOfBook){
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }
    public void setNameOfBook(String nameOfBook){
        this.nameOfBook = nameOfBook;
    }

    @Override
    public void print() {
        System.out.println("Я выпускаю только книги");
    }

    public static void printBook(Printable[] printable){
        for (Printable value : printable) {
            if (value instanceof Book) {
                System.out.println( ((Book) value).getNameOfBook());
            }
        }
}}
