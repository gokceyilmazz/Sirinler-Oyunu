
package sirinleroyun;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Azman extends Dusman{

    int konum_x=0;
    int konum_y=0;
    public Azman() {
    }

    public Azman(int karakterID, String karakterAdi, String karakterTur) {
        super(karakterID, karakterAdi, karakterTur);
    }

    @Override
    public int getKarakterID() {
        return super.getKarakterID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKarakterID(int karakterID) {
        super.setKarakterID(4); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKarakterAd() {
        return super.getKarakterAd(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKarakterAd(String karakterAd) {
        super.setKarakterAd("azman"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKarakterTur() {
        return super.getKarakterTur(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKarakterTur(String karakterTur) {
        super.setKarakterTur("dusman"); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setkonum(int konum_x,int konum_y)
	{
		this.konum_x=konum_x;
		this.konum_y=konum_y;
	}
	public int getkonum_x()
	{
		return konum_x;
	}
	public int getkonum_y()
	{
		return konum_y;
	}
}
