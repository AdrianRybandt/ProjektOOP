package controler;

import model.BasicData;
import model.Owoc;
import model.GatunekOwocu;
public class OwocControler implements IWartosciOdzywcze, ICena{
    public void wyliczMakro(Owoc owoc) {
            switch(owoc.getGatunekOwocu())
            {
                case JABLKO:
                    owoc.setBialko(0);
                    owoc.setTluszcze(0);
                    owoc.setWeglowodany(owoc.getIloscG()*0.3f);
                    break;
                case CYTRUSY:
                    owoc.setBialko(0);
                    owoc.setTluszcze(0);
                    owoc.setWeglowodany(owoc.getIloscG()*0.25f);
                    break;
                case WINOGRONA:
                    owoc.setBialko(0);
                    owoc.setBialko(0);
                    owoc.setWeglowodany(owoc.getIloscG()*0.2f);
                    break;
            }
    }

    @Override
    public void wyliczKalorie(BasicData basicData) {
        basicData.setKcal(basicData.getWeglowodany()*0.8f);
    }

    @Override
    public void obliczCene(BasicData basicData) {
        basicData.setCena((basicData.getIloscG()+basicData.getKcal())*0.01f);
    }
}
