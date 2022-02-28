package interval;

/**
 * 
 * @author catherine
 *@invar de ondergrens is niet groter dan de bovengrens
 *|getOndergrens() <= getBovengrens()
 *@invar De lengte is gelijk aan het verschil van de bovengrens en de ondergrens
 *| getLengte() = getBovengrens() – getOndergrens()

 */

public class Interval {
	/**
	 * Representatie-invariant:
	 * @invar de lengte is niet negatief
	 * 	| 0 <= lengte
	 */
	
	private int ondergrens;
	private int bovengrens;
		
	// static maakt het instantiemethode
	 public int getOndergrens() {
		return this.ondergrens;
	}
	
	 public int getBovengrens( ) {
		return this.bovengrens;
	}
	
	 public int getLengte() {
		 return this.lengte;
	 }
	 
	 /**
	  * @post | getOndergrens() == 0
	  * @post | getBovengrens() == 0
	  * @param waarde
	  */
	
	 public Interval () {}
	 
	 /**
	  * @post | getOndergrens() == ondergrens
	  * @post | getBovengrens() == bovengrens
	  * @param waarde
	  */
	 
	 public Interval(int ondergrens, int bovengrens) {
		 if (ondergrens > bovengrens)
			 throw new IllegalArgumentException("Ondergrens is groter dan bovengrens");
		 this.ondergrens = ondergrens;
		 this.bovengrens = bovengrens;
	 
	 }
	 /**
	  * stelt de ondergrens in. Laat de bovengrens ongewijzigd
	  * @pre | waarde <= getBovengrens()
	  * @post | getOndergrens() == waarde
	  * @post | getBovengrens() == old(getBovengrens())
	  * @param waarde
	  */
	 public void setOndergrens(int waarde) {
		this.ondergrens = waarde ;
	}
	 /**
	  * stelt de bovengrens in. Laat de ondergrens ongewijzigd
	  * @pre | waarde => getOndergrens()
	  * @post | getBovengrens() == waarde
	  * @post | getOndergrens() == old(getOndergrens())
	  * @param waarde
	  */
	
	public void setBovengrens(int waarde) {
		this.bovengrens = waarde;
	}
	
	 public int getLengte(int waarde) {
		return this.bovengrens - this.ondergrens;
	}
	 
	
	
}
