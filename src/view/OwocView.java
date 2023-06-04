package view;
import model.Napoj;
import model.Owoc;
import model.GatunekOwocu;
import model.RodzajNapoju;

import java.util.Scanner;

public class OwocView {
    public Owoc stworzOwoc()
    {
        String name;
        int iloscG;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe owocu: ");
        name = scan.nextLine();
        System.out.println("Podaj ilosc gram: ");
        iloscG = scan.nextInt();
        System.out.println("Podaj gatunek owocu: ");
        int wybor=0;
        while(wybor<1 || wybor > 3)
        {
            System.out.println("[1]Winogrona");
            System.out.println("[2]Cytrusy");
            System.out.println("[3]Jablko");
            wybor=scan.nextInt();
        }
        switch(wybor)
        {
            case 1:
                return new Owoc(name, GatunekOwocu.WINOGRONA, iloscG);
            case 2:
                return new Owoc(name, GatunekOwocu.CYTRUSY, iloscG);
            case 3:
                return new Owoc(name, GatunekOwocu.JABLKO, iloscG);
        }
        return new Owoc(name, GatunekOwocu.JABLKO, 0);
    }
}
