package moduleFolder;

import java.util.*;

public class Player {
   private static String name;
   Peg peg = new Peg();
   String[] color = new String[8];
   private final Random random = new Random();
   private final String[] fourColor = new String[4];
   
   //Empty constructor
   public Player () {   
   }
   
   //Overloaded constructor
   public Player ( String n ) {
      this.name = n;
   }
   
   //Set player's name
   public void setName ( String playerName ) {
      name = playerName;
   }
   
   //Get player's name
   public String getName() {
      return name;
   }   
   
   //Get random peg combination
   public String[] getPegColor() {     
	  peg.addColor( );		  
	  return (color);
   }
   
   
   /*
   //Doesn't work 
   public String[] getPegCombination() {      
      for ( int i = 0; i < 4; i++ ) {
	     System.out.println( color[i] );
	     fourColor[i] = color[random.nextInt(color.length)];
         System.out.println( fourColor[i] );	  
      }
	  return(fourColor);
   }
   */
  
   @Override
   public String toString() {	     
		    return ("\nPeg colors are  " + getPegColor() + "\nPlayer name :" + name);        
   }//end method toString  

public static void main ( String[] args ) {
   Player player = new Player();
   name = "John";
   System.out.println(player.toString());
}
   
} //End class Player
