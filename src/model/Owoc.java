package model;

public class Owoc extends BasicData {
    private GatunekOwocu gatunekOwocu;

    public GatunekOwocu getGatunekOwocu() {
        return gatunekOwocu;
    }

    public void setGatunekOwocu(GatunekOwocu gatunekOwocu) {
        this.gatunekOwocu = gatunekOwocu;
    }

    public Owoc(String nazwa, GatunekOwocu gatunekOwocu, int iloscG) {
        setNazwa(nazwa);
        setGatunekOwocu(gatunekOwocu);
        setIloscG(iloscG);
    }
}