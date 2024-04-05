public class Postać {
    private String imie;
    private String typPostaci;
    private Atak strategiaAtaku;

    public Postać(String imie, String typPostaci, Atak strategiaAtaku) {
        this.imie = imie;
        this.typPostaci = typPostaci;
        this.strategiaAtaku = strategiaAtaku;
    }

    public void atakuj() {
        strategiaAtaku.atakuj();
    }
}