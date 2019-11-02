package es.unileon.prg1.pdate;
/**
 * 
 * @author andres
 *
 */
public class pdaPrincipal {
	public void main(String[] args) {
		Date miFecha = new Date();
		//Date miFecha2 = new Date(1,11,2020);
		
		System.out.println(miFecha);
		//System.out.println(miFecha2);
		
		Date today;
		
		try {
			today = new date(99, 14, 2017);
			Systeam.out.println(today.toString());
		}catch(Date Exception e) {
			System.out.println(e.getMessage());
		}
		
		}
		
		/*if(miFecha.isSameYear(miFecha2))
			System.out.println("\t Es el mismo año");
		else
			System.out.println("\t Es distinto año");
		
		if(miFecha.isSameYear(miFecha2))
			System.out.println("\t Es el mismo año");
		else
			System.out.println("\t Es distinto año");
		
		if(miFecha.isSameYear(miFecha2.getYear()))
			System.out.println("\t Es el mismo año");
		else
			System.out.println("\t Es distinto año");
	}
*/
}
