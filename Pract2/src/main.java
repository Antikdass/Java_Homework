import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) {
        Printable[] arr = {new Book("Witcher"), new Magazine("Times"), new Magazine("Split"), new Book("Brain")};
        Magazine.printMagazine(arr);
        System.out.println("----------------------");
        Book.printBook(arr);
        System.out.println("----------------------");
        for (Printable pr: arr){
            pr.print();
        }


    }
}
