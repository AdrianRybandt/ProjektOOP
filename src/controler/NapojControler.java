package controler;

import model.BasicData;
import model.Napoj;
public class NapojControler implements IWartosciOdzywcze, ICena{

    @Override
    public void wyliczKalorie(BasicData basicData) {
        basicData.setKcal(basicData.getBialko()*0.34f + basicData.getTluszcze()*0.24f + basicData.getWeglowodany()*0.44f);
    }

    public void wyliczMakro(Napoj napoj)
    {
        switch(napoj.getRodzajNapoju())
        {
            case WODA:
                napoj.setBialko(0);
                napoj.setTluszcze(0);
                napoj.setWeglowodany(0);
                break;
            case GAZOWANY:
                napoj.setBialko(0);
                napoj.setTluszcze(0);
                napoj.setWeglowodany(napoj.getIloscG()*0.4f);
            case MLECZNY:
                napoj.setBialko(napoj.getIloscG()*0.1f);
                napoj.setTluszcze(napoj.getIloscG()*0.15f);
                napoj.setWeglowodany(napoj.getIloscG()*0.28f);
        }
    }

    @Override
    public void obliczCene(BasicData basicData) {
        basicData.setCena(basicData.getIloscG()*0.003f);
    }
}
