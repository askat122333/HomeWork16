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
        System.out.println(nameOfMagazine);
    }
}
