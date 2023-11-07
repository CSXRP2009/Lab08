public class Tops implements Garment {
    private String type;
    public Tops(String type){
        this.type=type;
    }
    @Override
    public void describe() {
        System.out.println("This Garment is a "+type + " top");
    }
}
