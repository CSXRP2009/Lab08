public class Application {

    private Garment top;
    private Garment pants;
    private Garment shoes;

    public Application(GarmentFactory factory) {
        top = factory.createTops();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    public void revealContent(){
        top.describe();
        pants.describe();
        shoes.describe();
    }

}
