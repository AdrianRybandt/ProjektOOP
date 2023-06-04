import model.*;
import view.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Koszyk koszyk = new Koszyk();
        Scanner scan = new Scanner(System.in);
        ZestawView zestawView = new ZestawView();
        KoszykView koszykView = new KoszykView();

        boolean wyjdz = true;
        int wybor = 1;
        do {
         System.out.println("Co chcialbys zrobic:");
         System.out.println("[1]Dodaj nowy posilek");
         System.out.println("[2]Wyswietl swoje posilki");
         System.out.println("[3]Wyjdz");
         wybor = scan.nextInt();
         switch(wybor)
         {
             case 1:
                 koszyk.getListPrzedmiotw().add(zestawView.stworzZestaw());
                 break;
             case 2:
                 koszykView.wyswietlKoszyk(koszyk);
                 break;
             case 3:
                 wyjdz = false;
                 break;
         }
        }while(wyjdz);
    }
}