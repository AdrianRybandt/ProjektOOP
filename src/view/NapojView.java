package view;
import model.Napoj;
import model.RodzajNapoju;

import java.util.Scanner;
public class NapojView {
    public Napoj stworzNapoj()
    {
        String name;
        int iloscG;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe napoju: ");
        name = scan.nextLine();
        System.out.println("Podaj ilosc gram: ");
        iloscG = scan.nextInt();
        System.out.println("Podaj rodzaj napoju: ");
        int wybor=0;
        while(wybor<1 || wybor > 3)
        {
            System.out.println("[1]Woda");
            System.out.println("[2]Gazowany");
            System.out.println("[3]Mleczny");
            wybor=scan.nextInt();
        }
        switch(wybor)
        {
            case 1:
                return new Napoj(name, RodzajNapoju.WODA, iloscG);
            case 2:
                return new Napoj(name, RodzajNapoju.GAZOWANY, iloscG);
            case 3:
                return new Napoj(name, RodzajNapoju.MLECZNY, iloscG);
        }
        return new Napoj(name, RodzajNapoju.WODA, 0);
    }
}
