public class PartyFactory implements GarmentFactory{
    @Override
    public Tops createTops() {
        return new Tops("Party");
    }

    @Override
    public Pants createPants() {
        return new Pants("Party");
    }

    @Override
    public Shoes createShoes() {
        return new Shoes("Party");
    }
}
