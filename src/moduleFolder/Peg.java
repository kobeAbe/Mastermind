package moduleFolder;

public class Peg {
    private static String[] color = { "Blue", "Red", "Black", "White", "Green", "Orange", "Pink", "Gray" };
	
    //Empty constructor	
	public Peg() {	
	}
	
	//Overloaded constructor
	public Peg ( String[] color ) {
	   this.color = color;
	}
	
    public void setColor ( String[] c ) {
	   color = c;
	}   

    public static String[] addColor () {	 
      for ( int i = 0; i < color.length; i++ ) {	    
		 System.out.println( color[i] );
	  }
	  return color;
   } 	
	
	public String toString() {	     
		    return ("Peg color :  " + addColor());        
    }//end method toString
	
   
   /*
   //remove after testing
    public static void main ( String[] args ) {
	   Peg peg = new Peg(color);
	   peg.toString();
	}  
	*/
}
