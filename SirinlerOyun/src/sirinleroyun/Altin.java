
package sirinleroyun;

/**
 *
 * @author Gökçe Yılmaz
 */
public class Altin extends Obje{
           
	   int konum_x,konum_y;
	   
           
           public Altin()
	   {
		  
	   }
	   
	  
	  
		public void setAltinkonum(int konum_x,int konum_y)
		{
			this.konum_x=konum_x;
			this.konum_y=konum_y;
			
			
		}
		public int getAltinkonum_x()
		{
			return konum_x;
			
		}
		public int getAltinkonum_y()
		{
			return konum_y;
			
		}
		
		
		public int getAltinmiktari()
		{
			return 5;
		}
}
