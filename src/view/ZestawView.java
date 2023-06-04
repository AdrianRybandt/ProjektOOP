package view;
import model.Zestaw;
import controler.ZestawControler;
public class ZestawView {
    public Zestaw stworzZestaw()
    {
        System.out.println("Stworz swoj posilek: ");
        MiesoView miesoView = new MiesoView();
        NapojView napojView = new NapojView();
        OwocView owocView = new OwocView();
        ZestawControler zestawControler = new ZestawControler();

        return zestawControler.przygotujZestaw(napojView.stworzNapoj(), miesoView.stworzMieso(), owocView.stworzOwoc());
    }
}
