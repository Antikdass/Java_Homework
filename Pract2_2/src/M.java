public class M {
    public static void main(String[] args) {
        Instrumet[] i ={new Guitar(12,"Black",2500), new Drums(5,"Orange",5200), new Tube(40,1500)};
        for (Instrumet inst:i){
            inst.play();
        }
    }
}
