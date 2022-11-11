public class Magazine implements Printable{
    private  String nameOfMagazine;
    public Magazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    @Override
    public void print() {
        System.out.println("Я выпускаю толко журнала");
    }
    public static void printMagazine(Printable[] printable){
        for (Printable value : printable) {
            if (value instanceof Magazine) {
                System.out.println( ((Magazine) value).getNameOfMagazine());
            }
        }
}}
