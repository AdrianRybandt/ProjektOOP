package model;

public class Napoj extends BasicData{
    private int iloscMl;

    private RodzajNapoju rodzajNapoju;

    public Napoj(String nazwa, RodzajNapoju rodzajNapoju, int iloscG)
    {
        this.setNazwa(nazwa);
        this.setRodzajNapoju(rodzajNapoju);
        this.setIloscG(iloscG);
    }

    public RodzajNapoju getRodzajNapoju() {
        return rodzajNapoju;
    }
    public void setRodzajNapoju(RodzajNapoju rodzajNapoju) {
        this.rodzajNapoju = rodzajNapoju;
    }
}
