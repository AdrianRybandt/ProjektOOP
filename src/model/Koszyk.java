
package model;

import java.util.ArrayList;

public class Koszyk {
    private ArrayList <Zestaw> listPrzedmiotw = new ArrayList<>();

    public ArrayList<Zestaw> getListPrzedmiotw() {
        return listPrzedmiotw;
    }

    public void setListPrzedmiotw(ArrayList<Zestaw> listPrzedmiotw) {
        this.listPrzedmiotw = listPrzedmiotw;
    }
}
