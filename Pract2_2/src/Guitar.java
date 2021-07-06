public class Guitar implements Instrumet{
    int numberOfStrings;
    String color;
    int price;

    public Guitar(int numberOfStrings, String color, int price) {
        this.numberOfStrings = numberOfStrings;
        this.color = color;
        this.price = price;
    }

    @Override
    public void play() {
        System.out.println(String.format("The guitar is playind, with characteristics: Number of strings: %s, Collor: %s, Price: %s",numberOfStrings,color,price));
    }
}
