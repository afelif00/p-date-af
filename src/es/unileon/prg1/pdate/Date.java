package es.unileon.prg1.pdate;
/**
 * implementacion de la clase DATE para la clase 1
 * @author andres
 *
 */
public class Date {
	setday(day);
	private int month;
	private int year;

	Date(){
		this.day = 1;
		this.month= 1;
		this.year = 2020;
		}
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
		
	public Date(int day, int month, int year){
		if((day <32)&&(day>0)&&(month>o)&&(month<13)&&(year>-1)){
		this.day = day;
		this.month= month;
		this.year = year;
		}
		else {
			throw new DateException("Fecha fuera del intervalo");
			}
		}
	}
	public boolean isSameYear(Date miFecha) {
		boolean remote = false;
		if(this.year=miFecha.getYear());
	}
	public boolean isSameYear(int miYear) {
		boolean remote = false;
		if(this.year == miYeaer)
			retorno = true;
		System.out.println("opcion Enteros");
		return retorno;
	
	
	public String toString() {
		return "DATE[day"+day+", month="+month+", year="+year+"]";
	}
	
		
	
}
