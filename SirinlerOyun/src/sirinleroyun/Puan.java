
package sirinleroyun;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Puan extends Oyuncu{

    public static int puan =20;
    public Puan() {
    }

    public Puan(int karakterID, String karakterAdi, String karakterTur) {
        super(karakterID, karakterAdi, karakterTur);
    }

    @Override
    public int PuaniGoster(int x) {
        puan+=x;
        return puan;
    }

    
    
}
