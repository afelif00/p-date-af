package es.unileon.prg1.pdate;
/**
 * 
 * @author andres
 *
 */
public class pdaPrincipal {
	public void main(String[] args) {
		Date miFecha = new Date();
		Date miFecha2 = new Date(1,11,2020);
		
		System.out.println(miFecha);
		System.out.println(miFecha2);
		
		if(miFecha.isSameYear(miFecha2))
			System.out.println("Es el mismo año");
		else
			System.out.println("Es distinto año");
		
		if(miFecha.isSameYear(miFecha2.get))
			System.out.println("Es el mismo año");
		else
			System.out.println("Es distinto año");
		
	}

}
