public class Pants implements Garment{
    private String type;
    public Pants(String type){
        this.type=type;
    }
    @Override
    public void describe() {
        System.out.println("This Garment is a "+type + " pair of pants");
    }
}
