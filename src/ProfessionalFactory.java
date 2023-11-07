public class ProfessionalFactory implements GarmentFactory {

    @Override
    public Tops createTops() {
        return new Tops("Professional");
    }

    @Override
    public Pants createPants() {
        return new Pants("Professional");
    }

    @Override
    public Shoes createShoes() {
        return new Shoes("Professional");
    }
}
