public class Tube implements Instrumet{
    int diameter;
    int price;

    public Tube(int diameter, int price) {
        this.diameter = diameter;
        this.price = price;
    }

    @Override
    public void play() {
        System.out.println(String.format("The tube is playind, with characteristics: %s, %s",diameter,price));
    }
}
