package view;
import model.Koszyk;
import model.Zestaw;
public class KoszykView {
    public void wyswietlKoszyk(Koszyk koszyk)
    {
        int ilosc = 1;
        for(Zestaw zestaw : koszyk.getListPrzedmiotw())
        {
            System.out.println("Zestaw "+ilosc+" :");
            System.out.println(zestaw.getMieso().toString());
            System.out.println(zestaw.getNapoj().toString());
            System.out.println(zestaw.getOwoc().toString());
            ilosc++;
        }
    }
}
