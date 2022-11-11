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
        System.out.println(nameOfBook);
    }
}
