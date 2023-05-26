package model;

public class Napoj extends BasicData{
    private int iloscMl;

    public int getIloscMl() {
        return iloscMl;
    }

    public void setIloscMl(int iloscMl) {
        this.iloscMl = iloscMl;
    }

    public Napoj(String nazwa, float cena, int iloscMl)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscMl = iloscMl;
    }

    public Napoj()
    {

    }
}
