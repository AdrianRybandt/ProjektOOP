package model;

public class Mieso extends BasicData{
    private RodzajMiesa rodzajMiesa;
    public Mieso(String nazwa, RodzajMiesa rodzajMiesa, int iloscG)
    {
        setRodzajMiesa(rodzajMiesa);
        setNazwa(nazwa);
        setIloscG(iloscG);
    }

    public RodzajMiesa getRodzajMiesa() {
        return rodzajMiesa;
    }

    public void setRodzajMiesa(RodzajMiesa rodzajMiesa) {
        this.rodzajMiesa = rodzajMiesa;
    }

}
