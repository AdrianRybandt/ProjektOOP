package view;
import model.Mieso;
import model.Napoj;
import model.RodzajMiesa;
import model.RodzajNapoju;

import java.util.Scanner;

public class MiesoView {
    public Mieso stworzMieso()
    {
        String name;
        int iloscG;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe mieska: ");
        name = scan.nextLine();
        System.out.println("Podaj ilosc gram: ");
        iloscG = scan.nextInt();
        System.out.println("Podaj rodzaj miesa: ");
        int wybor=0;
        while(wybor<1 || wybor > 3)
        {
            System.out.println("[1]Kurczak");
            System.out.println("[2]Wolowina");
            System.out.println("[3]Wieprzowina");
            wybor=scan.nextInt();
        }
        switch(wybor)
        {
            case 1:
                return new Mieso(name, RodzajMiesa.KURCZAK, iloscG);
            case 2:
                return new Mieso(name, RodzajMiesa.WOLOWINA, iloscG);
            case 3:
                return new Mieso(name, RodzajMiesa.WIEPRZOWINA, iloscG);
        }
        return new Mieso(name, RodzajMiesa.KURCZAK, 0);
    }
}
