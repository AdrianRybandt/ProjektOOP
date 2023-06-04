package controler;

import model.BasicData;
import model.Mieso;
public class MiesoControler implements IWartosciOdzywcze, ICena {
    @Override
    public void wyliczKalorie(BasicData basicData) {
        basicData.setKcal(basicData.getBialko()*0.5f + basicData.getTluszcze()*0.3f + basicData.getWeglowodany()*0.1f);
    }

    public void wyliczMakro(Mieso mieso){
        switch(mieso.getRodzajMiesa())
        {
            case KURCZAK:
                mieso.setBialko(mieso.getIloscG()*0.6f);
                mieso.setWeglowodany(mieso.getIloscG()*0.34f);
                mieso.setTluszcze(mieso.getIloscG()*0.4f);
                break;
            case WOLOWINA:
                mieso.setBialko(mieso.getIloscG()*0.65f);
                mieso.setWeglowodany(mieso.getIloscG()*0.3f);
                mieso.setTluszcze(mieso.getIloscG()*0.41f);
                break;
            case WIEPRZOWINA:
                mieso.setBialko(mieso.getIloscG()*0.54f);
                mieso.setWeglowodany(mieso.getIloscG()*0.4f);
                mieso.setTluszcze(mieso.getIloscG()*0.51f);
                break;
        }
    }

    @Override
    public void obliczCene(BasicData basicData) {
        basicData.setCena(basicData.getKcal()*0.02f);
    }
}
