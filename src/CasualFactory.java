public class CasualFactory implements GarmentFactory {
    @Override
    public Tops createTops() {
        return new Tops("Casual");
    }

    @Override
    public Pants createPants() {
        return new Pants("Casual");
    }

    @Override
    public Shoes createShoes() {
        return new Shoes("Casual");
    }
}
