public class Book implements Printable{
    String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void printBook(Printable[] printables){
        for (Printable p : printables){
            if (p instanceof Book){
                p.print();
            }
        }

    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
