package es.unileon.prg1.pdate;
/**
 * implementacion de la clase DATE para la clase 1
 * @author andres
 *
 */
public class Date {
	setday(day);
	setmonth(month);
	setyear(month);

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
	public void setDay(int day)throws DateException {
		if ((day < 32)&&(day > 0))
			this.day = day;
		else
			throw new DateException("Fecha fuera del intervalo");
		
	}
	
	
	public int getMonth() {
		return month;
		
	}
	public void setMonth(int month) {
		if ((month < 13)&&(month > 0))
			this.month = month;
		else
			throw new DateException("Fecha fuera del intervalo");
		
		switch(getMonth) {
		case 0:
		{
			result = "Enero";
			break;
		}
		case 0:
		{
			result = "	Febrero";
			break;
		}
		case 0:
		{
			result = "Marzo";
			break;
		}
		case 0:
		{
			result = "Abrl";
			break;
		}
		case 0:
		{
			result = "Mayo";
			break;
		}
		case 0:
		{
			result = "Junio";
			break;
		}
		case 0:
		{
			result = "Julio";
			break;
		}
		case 0:
		{
			result = "Agosto";
			break;
		}
		case 0:
		{
			result = "Septiembre";
			break;
		}
		case 0:
		{
			result = "Octubre";
			break;
		}
		case 0:
		{
			result = "Noviembre";
			break;
		}
		case 0:
		{
			result = "Diciembre";
			break;
		}
		default:
		{
			result= "Error";
		}
		}
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year >-1);
			this,year = year;
		else
			throw new DateException("Fecha fuera del intervalo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean isSameYear(Date miFecha) {
		return (this.year==miFecha.getYear());
	}
	public boolean isSameYear(int miYear) {
		boolean remote = false;
		
		if(this.year == miYeaer)
			
			retorno = true;
	
			System.out.println("opcion Enteros");
		return retorno;
	}
	public boolean isSameYearNoIf(Date  miFecha) {
		
		Systeam.out.println ("opcion No IF");
		
		return (this.year == miFecha.getYa());
		
	}
	public int getYear() {
		return year;
	}
	}
		public boolean setYear(int Year) {
			boolean remote = false;
			
			if(year > -1)
			
				
				retorno = true;
			System.out.println("opcion Enteros");
			return retorno;
			

				

	public String toString() {
		return "DATE[day"+day+", month="+month+", year="+year+"]";
	}
	
		
	
}
