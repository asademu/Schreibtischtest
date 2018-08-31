public class tischtest {
    public static void main(String[] args) {
        tisch Evoli = new tisch();
        tisch Porygon = new tisch(93.34f, "Obi");

        System.out.println("Hoehe: " + Evoli.getHoehe() + "\nHersteller: " + Evoli.getHersteller());
        System.out.println("\nHoehe: " + Porygon.getHoehe() + "\nHersteller: " + Porygon.getHersteller());
    }
}


