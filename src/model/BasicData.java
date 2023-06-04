package model;

public abstract class BasicData {
    private String nazwa;
    private float cena;

    private float bialko;
    private float weglowodany;
    private float tluszcze;
    private float kcal;

    private int iloscG;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public float getBialko() {
        return bialko;
    }

    public void setBialko(float bialko) {
        this.bialko = bialko;
    }

    public float getWeglowodany() {
        return weglowodany;
    }

    public void setWeglowodany(float weglowodany) {
        this.weglowodany = weglowodany;
    }

    public float getTluszcze() {
        return tluszcze;
    }

    public void setTluszcze(float tluszcze) {
        this.tluszcze = tluszcze;
    }

    public float getKcal() {
        return kcal;
    }

    public void setKcal(float kcal) {
        this.kcal = kcal;
    }

    public int getIloscG() {
        return iloscG;
    }

    public void setIloscG(int iloscG) {
        this.iloscG = iloscG;
    }

    public String toString()
    {
        StringBuilder result = new StringBuilder();
        return result.append("[Nazwa]:")
                .append(this.getNazwa())
                .append(" [Cena]:")
                .append(this.getCena())
                .append(" [Waga (gramy)]:")
                .append(this.getIloscG())
                .append("\n [Weglowodany]:")
                .append(this.getWeglowodany())
                .append(" [Tluszcze]:")
                .append(this.getTluszcze())
                .append(" [Bialko]:")
                .append(this.getBialko())
                .append(" [KCAL]:")
                .append(this.getKcal())
                .append("\n")
                .toString();
    }

}
