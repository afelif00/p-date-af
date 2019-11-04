package es.unileon.prg1.pdate;

import es.unileon.prg1.date.DateException;

/**
 * implementacion de la clase DATE para la clase 1
 * @author andres
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	
	

	void Date(){
		this.day = 1;
		this.month= 1;
		this.year = 2020;
		}
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @throws DateException 
	 */
		
	public Date(int day, int month, int year) throws DateException{
		if((day <32)&&(day>0)&&(month>0)&&(month<13)&&(year>-1)){
		this.day = day;
		this.month= month;
		this.year = year;
		}
		else {
			throw new DateException("Fecha fuera del intervalo");
			}
	}
	public void setDay1(int day)throws DateException {
		if ((day < 32)&&(day > 0))
			this.day = day;
		else
			throw new DateException("Fecha fuera del intervalo");
		
	}
	

	/*public int getMonth() {
		return this.month;
		
	}
	public void setMonth(int month) throws DateException {
		if ((month < 13)&&(month > 0))
			this.month = month;
		else
			throw new DateException("Fecha fuera del intervalo");
		
		
	}*/
	
	
	
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
			boolean retorno = false;
			
			if(year > -1)
				this.year = Year;
				
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
			
			return (this.month == month.getMonth());
			
		}
		
		public boolean isSameMonthNoIf(int  miMonth) {
			
			System.out.println ("opcion No IF");
			
			return (this.month == miMonth);
			
		}
		public int getMonth(){
			return month;
		}
		
			public boolean setMonth(int month) {
				boolean remote = false;
				
				if(month > 0 && month < 13)
					this.month = month;
					
					remote = true;
				System.out.println("opcion Enteros");
				return remote;
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
				
				return (this.day == miDay.getDay());
				
			}
			
			public boolean isSameDayNoIf(int  miDay) {
				
				System.out.println ("opcion No IF");
				
				return (this.day == miDay);
				
			}
			public int getDay() {
				return day;
			}
			
				public boolean setDay(int day) {
					boolean remote = false;
					
					if(day > 0 && day < 32)
						this.day = day;
						
						remote = true;
					System.out.println("opcion Enteros");
					return remote;
				}
			//issame
				public boolean isSame(int day,int month,int year ) {
					boolean retorno = false;
					
					if(this.day == day && this.month== month && this.year == year  )
						
						retorno = true;
				
						System.out.println("es el mismo");
					return retorno;
				}
				public boolean isSame(Date issame) {
					boolean retorno = false;
					
					if(this.day == issame.getDay() && this.month== issame.getMonth() && this.year == issame.getYear())
						
						retorno = true;
				
						System.out.println("es el mismo");
					return retorno;
				}
				
				public boolean isSameNoIf(int day,int month,int year ) {

						System.out.println("es el mismo");
					return (this.day == day && this.month== month && this.year == year);
				}
				public boolean isSameNoIf(Date issame) {
			
						System.out.println("es el mismo");
					return (this.day == issame.getDay() && this.month== issame.getMonth() && this.year == issame.getYear());
				}
				
				//MESES
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
					return  result;
				} 
				//verificar dias
				public boolean getDiasMes(){
					boolean devol = false;
					
				switch(this.month){
					case 2:
					{
						if(this.day> 0 && this.day < 29)
							devol = true;
						break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
						if(this.day>0 && this.day < 31)
							devol = true;
						break;
					}
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						if(this.day > 0 && this.day < 32)
							devol = true;
						break;
					}
					default:
					{
						devol= false;	
					}
				}					
					
					return devol;
				}
				
				//ESTACIONES
				public String getSeason() {
					String estacion;
					//primavera marzo junio
					switch(this.month) {
					case 3:
					case 4:
					case 5:
					{
						estacion = "primavera";
					
						break;
					}
					//verano junio septiembre
					case 6:
					case 7:
					case 8:
					{
						estacion = "verano";
						break;
					}
					//otoño septiembre diciembre
					case 9 :
					case 10 :
					case 11 :
					{
						estacion = "otoño";
						break;
					}
					//invierno diciembre marzo
					case 12:
					case 1:
					case 2:
					{
						estacion = "invierno";
						break;
					}
					default:
					{
						estacion= "Error";
					}
					
				}
					return  estacion;
			}
			//MESES RESTANTES
				public int getMonthsLeft() {
					return(12 - this.month);
				}
				
			//devolver fecha en formato de cadena de texto
				public String toString() {
					return "DATE[day"+day+", month="+month+", year="+year+"]";
				}
				
				//devolver todas las fechas hasta el final de mes
				public void getMonthDate(){
					int dias = 0;
				switch(this.month){
					case 2:
					{
						dias = 29;
						break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
						dias = 30;
						break;
					}
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						dias = 31;
						break;
					}
					default:
					{
						dias = 0;	
					}
				}					
				
				for(int i = this.day+1 ; i <= dias ; i++) {
					System.out.println(i+"/"+this.month+"/"+this.year);
				}
				
				}				
				
				//devolver todas los meses con el mismo numero de dias
				public String getMonthDay(){
					String meses = "";
				switch(this.month){
					case 2:
					{
						meses = "Febrero";
						break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
						meses = "Abril, Junio, Septiembre, Noviembre";
						break;
					}
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						meses = "Enero, Marzo, Mayo ,Julio, Agosto, Octubre, Diciembre";
						break;
					}
					default:
					{
						meses = "";	
					}
				}					
				
				return meses;
				
				}				
				
				//contar los dias desde el primer dia del año
				public int getYearDay() {
					int dias = 0;
					
					switch(this.month) {
					case 1:
					{
						dias = this.day;
						break;
					}
					case 2:
					{
						dias = 31 + this.day;
						break;
					}
					case 3:
					{
						dias = 59 + this.day;
						break;
					}
					case 4:
					{
						dias = 90 + this.day;
						break;
					}
					case 5:
					{
						dias = 120 + this.day;
						break;
					}
					case 6:
					{
						dias = 151 + this.day;
						break;
					}
					case 7:
					{
						dias = 181 + this.day;
						break;
					}
					case 8:
					{
						dias = 212 + this.day;
						break;
					}
					case 9:
					{
						dias = 243 + this.day;
						break;
					}
					case 10:
					{
						dias = 273 + this.day;
						break;
					}
					case 11:
					{
						dias = 304 +this.day;
						break;
					}
					case 12:
					{
						dias = 334 + this.day;
						break;
					}
					default:
					{
						dias = 0;
					
				}
					}
					return  dias-1;
				} 
				
				// numero random con while y dowhile
				public int randomNumberWhile(){
					int attempts = 0;
					boolean found = false;
					while(!found) {
						//((Math.random() * (valorMaximo - valorMinimo)) + valorMinimo
						attempts++;
						int rand = (int) ((Math.random() * 364) + 1);
						if(rand == this.getYearDay()) {
							found = true;
						}
					}
					return attempts;	
				}
				
				public int randomNumberDoWhile(){
					int attempts = 0;
					boolean found = false;
					do{
						//((Math.random() * (valorMaximo - valorMinimo)) + valorMinimo
						attempts++;
						int rand = (int) ((Math.random() * 364) + 1);
						if(rand == this.getYearDay()) {
							found = true;
						}
					}while(!found);
					return attempts;	
				}
				//saber el dia de la semana
				public String getWeekDay(int numberDay) {
					String diasSemana = "";
					int semanas = 0;
					int diasPasados = this.getYearDay();
					semanas = (diasPasados % 7) + numberDay-1;
					while(semanas > 7) {
						semanas %= 7;
					}
					switch(semanas) {
						case 1:
						{
							diasSemana ="lunes";
							break;
						}
						case 2:
						{
							diasSemana ="manter";
							break;
						}
						case 3:
						{
							diasSemana ="miercoles";
							break;
						}
						case 4:
						{
							diasSemana ="jueves";
							break;
						}
						case 5:
						{
							diasSemana ="viernes";
							break;
						}
						case 6:
						{
							diasSemana ="sabado";
							break;
						}
						case 7:
						{
							diasSemana ="domingo";
							break;
						}
						default:
						{
							diasSemana ="error";
						}
					}
					return diasSemana;
				}
				
				
				
				/*public void setYear(int year) {
					if(year >-1);
						this.year = year;
					else
						throw new DateException("Fecha fuera del intervalo");
				}	*/
				
			/*public void setday(int day) {
					this.day = day ;
			}
			public void setmonth(int month) {
					this.month =month;
			}
			public void setyear(int year) {
					this.year =year;
			}
			
			public int getday(int day) {
				return day ;
			}
			public int getmonth(int month) {
					return month;
			}
			public int getyear(int year) {
				return year;
			}*/

	
		
	
}
