package es.unileon.prg1.pdate;

import es.unileon.prg1.date.DateException;

/**
 * 
 * @author andres
 *
 */
public class pdaPrincipal {
	public void main(String[] args) throws DateException {
		//Date miFecha = new Date();
		Date miFecha2 = new Date(1,11,2020);
		
		//System.out.println(miFecha);
		System.out.println(miFecha2.isSame(new Date(1,11,2020)));
		System.out.println(miFecha2.getMonthName());
		System.out.println(miFecha2.getMonthDay());
		System.out.println(miFecha2.getMonthsLeft());
		miFecha2.getMonthDate();
		System.out.println(miFecha2.getSeason());
		System.out.println(miFecha2.toString());
		System.out.println(miFecha2.getYearDay());
		System.out.println(miFecha2.randomNumberDoWhile());
		System.out.println(miFecha2.randomNumberWhile());
		System.out.println(miFecha2.getWeekDay(3));
		System.out.println(miFecha2.getDiasMes());
		
		Date today;
		
		/*try {
			today = new Date(99, 14, 2017);
			System.out.println(today.toString());
		}catch(Date Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		
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
