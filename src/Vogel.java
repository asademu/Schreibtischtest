public abstract class Vogel implements Flugfaehig {
    private float schnabellaenge;

    public Vogel(){
        setSchnabellaenge(0.5f);
        gebeLaut();
    }

    public Vogel(float schnabellaenge){
        setSchnabellaenge(schnabellaenge);
        gebeLaut();
    }

    public void setSchnabellaenge(float schnabellaenge) {
        this.schnabellaenge = schnabellaenge;
    }

    public float getSchnabellaenge() {
        return schnabellaenge;
    }

    public String gebeLaut(){
        return "";
    }
}
