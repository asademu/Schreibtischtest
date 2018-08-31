public class Papagei extends Vogel {
    private int sprachbegabung;

    public Papagei(){
        super();
        setSprachbegabung(1);
    }

    public Papagei(float schnabellaenge, int sprachbegabung){
        setSchnabellaenge(schnabellaenge);
        setSprachbegabung(sprachbegabung);
    }

    public void setSprachbegabung(int sprachbegabung) {
        if (sprachbegabung >= 0 && sprachbegabung <= 10) {
            this.sprachbegabung = sprachbegabung;
        }
        else {
            System.out.println("ungültiger Wert");
        }
    }

    public int getSprachbegabung() {
        return sprachbegabung;
    }

    public String gebeLaut(){
        return "Krächzs";
    }

    public void fliege(){
        System.out.println("Der Papagei hebt ab!");
    }
}
