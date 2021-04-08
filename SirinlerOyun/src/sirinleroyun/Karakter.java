
package sirinleroyun;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Karakter {
    private int karakterID;
    private String karakterAd;
    private String karakterTur;
    
    
    public Karakter(){
    }
    
    public Karakter(int karakterID, String karakterAdi , String karakterTur){
        this.karakterID = karakterID;
        this.karakterAd = karakterAd;
        this.karakterTur = karakterTur;
    }

    public int getKarakterID() {
        return karakterID;
    }

    public void setKarakterID(int karakterID) {
        this.karakterID = karakterID;
    }

    public String getKarakterAd() {
        return karakterAd;
    }

    public void setKarakterAd(String karakterAd) {
        this.karakterAd = karakterAd;
    }

    public String getKarakterTur() {
        return karakterTur;
    }

    public void setKarakterTur(String karakterTur) {
        this.karakterTur = karakterTur;
    }
    
    
}
