package controler;
import model.*;
public class ZestawControler {
    public Zestaw przygotujZestaw(Napoj napoj, Mieso mieso, Owoc owoc)
    {
        MiesoControler miesoControler = new MiesoControler();
        NapojControler napojControler = new NapojControler();
        OwocControler owocControler = new OwocControler();

        miesoControler.wyliczMakro(mieso);
        napojControler.wyliczMakro(napoj);
        owocControler.wyliczMakro(owoc);

        przygotujPrzedmiot(miesoControler, miesoControler, mieso);
        przygotujPrzedmiot(napojControler, napojControler, napoj);
        przygotujPrzedmiot(owocControler, owocControler, owoc);

        return new Zestaw(napoj, mieso, owoc);
    }

    public float cenaZestawu(Zestaw zestaw)
    {
        return zestaw.getMieso().getCena()+zestaw.getOwoc().getCena()+zestaw.getNapoj().getCena();
    }

    private void przygotujPrzedmiot(ICena iCena, IWartosciOdzywcze iWartosciOdzywcze, BasicData basicData)
    {
        iCena.obliczCene(basicData);
        iWartosciOdzywcze.wyliczKalorie(basicData);
    }
}
