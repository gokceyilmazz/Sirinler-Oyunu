
package sirinleroyun;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Dusman extends Karakter {

    public Dusman() {
    }

    public Dusman(int karakterID, String karakterAdi, String karakterTur) {
        super(karakterID, karakterAdi, karakterTur);
    }

    @Override
    public void setKarakterTur(String karakterTur) {
        super.setKarakterTur(karakterTur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKarakterTur() {
        return super.getKarakterTur(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKarakterAd(String karakterAd) {
        super.setKarakterAd(karakterAd); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKarakterAd() {
        return super.getKarakterAd(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKarakterID(int karakterID) {
        super.setKarakterID(karakterID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getKarakterID() {
        return super.getKarakterID(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
