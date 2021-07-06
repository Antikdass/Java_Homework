public class Drums implements Instrumet{
    int numperOfDrums;
    String color;
    int price;

    public Drums(int numperOfDrums, String color, int price) {
        this.numperOfDrums = numperOfDrums;
        this.color = color;
        this.price = price;
    }

    @Override
    public void play() {
        System.out.println(String.format("The drums is playind, with characteristics:Number of drums: %s, Collor: %s, Price: %s", numperOfDrums,color,price));
    }
}
