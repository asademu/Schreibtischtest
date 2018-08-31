public class tisch {
    private float hoehe;
    private String hersteller;

    public tisch(){
        setHoehe(0);
        setHersteller("");
    }

    public tisch(float hoehe, String hersteller){
        setHoehe(hoehe);
        setHersteller(hersteller);
    }

    public void setHoehe(float hoehe){
        this.hoehe = hoehe;
    }

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

    public float getHoehe() {
        return hoehe;
    }

    public String getHersteller() {
        return hersteller;
    }
}
