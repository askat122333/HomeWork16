public class Main {
    public static void main(String[] args) {
      Book book1 = new Book("О моем перерождении в слизь");
        Book book2 = new Book("Распятие шести");

      Magazine magazine1 = new Magazine("Модник");
        Magazine magazine2 = new Magazine("Модница");


        Printable[] printables = {book1,book2,magazine1,magazine2};
        System.out.println("Список журналов и книг : ");
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
}