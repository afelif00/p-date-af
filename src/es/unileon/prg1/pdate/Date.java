package es.unileon.prg1.pdate;
/**
 * implementacion de la clase DATE para la clase 1
 * @author andres
 *
 */
public class Date {
	private int day;
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
	public void setDay(int day)throws DateException {
		if ((day < 32)&&(day > 0))
			this.day = day;
		else
			throw new DateException("Fecha fuera del intervalo");
		
	}
	
	//ACABAR ESTACIONES
	public String getSeason() {
		String estacion;
		//primavera marzo junio
		switch(this.month) {
		case 3:
		case 4:
		case 5:
		case 6:
			estacion = "primavera";
			break;
		}
		//verano junio septiembre
		case 6:
		case 7:
		case 8:
		case 9:
		{
			estacion = "verano";
			break;
		}
		//otoño septiembre diciembre
		case 9 :
		case 10 :
		case 11 :
		case 12 :
		{
			estacion = "otoño";
			break;
		}
		//invierno diciembre marzo
		case 12 :
		case 1 :
		case 2 :
		case 3 :
		{
			estacion = "invierno";
			break;
		}
		default:
		{
			estacion= "Error";
		}
		return estacion;
	} 
	
	
	public int getMonth() {
		return this.month;
		
	}
	public void setMonth(int month) {
		if ((month < 13)&&(month > 0))
			this.month = month;
		else
			throw new DateException("Fecha fuera del intervalo");
		
		
	}
	
	public String getMonthName() {
		String result;
		
		switch(this.month) {
		case 1:
		{
			result = "Enero";
			break;
		}
		case 2:
		{
			result = "	Febrero";
			break;
		}
		case 3:
		{
			result = "Marzo";
			break;
		}
		case 4:
		{
			result = "Abrl";
			break;
		}
		case 5:
		{
			result = "Mayo";
			break;
		}
		case 6:
		{
			result = "Junio";
			break;
		}
		case 7:
		{
			result = "Julio";
			break;
		}
		case 8:
		{
			result = "Agosto";
			break;
		}
		case 9:
		{
			result = "Septiembre";
			break;
		}
		case 10:
		{
			result = "Octubre";
			break;
		}
		case 11:
		{
			result = "Noviembre";
			break;
		}
		case 12:
		{
			result = "Diciembre";
			break;
		}
		default:
		{
			result= "Error";
		
	}
		}
		return = result;
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
	
	
	
	//HACER LO MISMO CON MONTH Y DAY
	
	public boolean isSameYear(Date miFecha) {
		boolean retorno = false;
		
		if(this.year == miFecha.getYear())
			
			retorno = true;
	
			System.out.println("opcion Fechas");
		return retorno;
	}
	public boolean isSameYear(int miYear) {
		boolean retorno = false;
		
		if(this.year == miYear)
			
			retorno = true;
	
			System.out.println("opcion Enteros");
		return retorno;
	}
	public boolean isSameYearNoIf(Date  miFecha) {
		
		System.out.println ("opcion No IF");
		
		return (this.year == miFecha.getYear());
		
	}
	
	public boolean isSameYearNoIf(int  miYear) {
		
		System.out.println ("opcion No IF");
		
		return (this.year == miYear);
		
	}
	public int getYear() {
		return year;
	}
	
		public boolean setYear(int Year) {
			boolean remote = false;
			
			if(year > -1)
			
				
				retorno = true;
			System.out.println("opcion Enteros");
			return retorno;
		}
		// MONTH
		
		public boolean isSameMonth(Date miFecha) {
			boolean retorno = false;
			
			if(this.month == miFecha.getMonth())
				
				retorno = true;
		
				System.out.println("opcion mes");
			return retorno;
		}
		public boolean isSameMonth(int miMonth) {
			boolean retorno = false;
			
			if(this.month == miMonth)
				
				retorno = true;
		
				System.out.println("opcion Enteros");
			return retorno;
		}
		public boolean isSameMonthNoIf(Date month) {
			
			System.out.println ("opcion No IF");
			
			return (this.month == miMonth.getMonth());
			
		}
		
		public boolean isSameMonthNoIf(int  miMonth) {
			
			System.out.println ("opcion No IF");
			
			return (this.month == miMonth);
			
		}
		public int getMonth() {
			return month;
		}
		
			public boolean setMonth(int month) {
				boolean remote = false;
				
				if(month > -1)
				
					
					retorno = true;
				System.out.println("opcion Enteros");
				return retorno;
			}
				
			// DAY
			
			public boolean isSameDay(Date miDay) {
				boolean retorno = false;
				
				if(this.day == miDay.getDay())
					
					retorno = true;
			
					System.out.println("opcion dia");
				return retorno;
			}
			public boolean isSameDay(int miDay) {
				boolean retorno = false;
				
				if(this.day == miDay)
					
					retorno = true;
			
					System.out.println("opcion Enteros");
				return retorno;
			}
			public boolean isSameDayNoIf(Date  miDay) {
				
				System.out.println ("opcion No IF");
				
				return (this.day == miFecha.getDay());
				
			}
			
			public boolean isSameDayNoIf(int  miDay) {
				
				System.out.println ("opcion No IF");
				
				return (this.day == miDay);
				
			}
			public int getDay() {
				return day;
			}
			
				public boolean setDay(int Day) {
					boolean remote = false;
					
					if(year > -1)
					
						
						retorno = true;
					System.out.println("opcion Enteros");
					return retorno;
				}
	public String toString() {
		return "DATE[day"+day+", month="+month+", year="+year+"]";
	}
	
		
	
}
