public class Magazine implements Printable{
    String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void printMagazine(Printable[] printables){
        for (Printable pp : printables){
            if (pp instanceof Magazine){
                pp.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
