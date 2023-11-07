public class Shoes implements Garment{
    private String type;
    public Shoes(String type){
        this.type=type;
    }
    @Override
    public void describe() {
        System.out.println("This Garment is a "+type + " pair of shoes");
    }
}
