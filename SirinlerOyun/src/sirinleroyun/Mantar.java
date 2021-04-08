
package sirinleroyun;



/**
 *
 * @author Gökçe Yılmaz
 */
public class Mantar extends Obje{
           
	   
	   int konum_x,konum_y;
	  
    public Mantar(){
        
    }
    
           
         
	  
	  
		public void setMantarkonum(int konum_x,int konum_y)
		{
			this.konum_x=konum_x;
			this.konum_y=konum_y;
			
			
		}
		public int getMantarkonum_x()
		{
			return konum_x;
			
		}
		public int getMantarkonum_y()
		{
			return konum_y;
			
		}
			
		public int getMantarmiktari()
		{
			return 1;
		}
    }
    
        
    

