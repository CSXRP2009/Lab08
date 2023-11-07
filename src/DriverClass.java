public class DriverClass {
    private static Application configureApplication(String type){

        Application app;
        GarmentFactory factory;

        if (type.equals("Professional")) {
            factory = new ProfessionalFactory();
            app = new Application(factory);
        } else if(type.equals("Casual")){
            factory = new CasualFactory();
            app = new Application(factory);
        }
        else{
            factory = new PartyFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app1 = configureApplication("Professional");
        app1.revealContent();
        Application app2 = configureApplication("Casual");
        app2.revealContent();
        Application app3 = configureApplication("Party");
        app3.revealContent();
    }
}
