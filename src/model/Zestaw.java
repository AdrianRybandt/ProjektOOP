package model;

public class Zestaw {
    private Napoj napoj;
    private Mieso mieso;
    private Owoc owoc;

    public Zestaw(Napoj napoj, Mieso mieso, Owoc owoc)
    {
        setNapoj(napoj);
        setMieso(mieso);
        setOwoc(owoc);
    }

    public Napoj getNapoj() {
        return napoj;
    }

    public void setNapoj(Napoj napoj) {
        this.napoj = napoj;
    }

    public Mieso getMieso() {
        return mieso;
    }

    public void setMieso(Mieso mieso) {
        this.mieso = mieso;
    }

    public Owoc getOwoc() {
        return owoc;
    }

    public void setOwoc(Owoc owoc) {
        this.owoc = owoc;
    }
}
