package progettoScacchi;

public class ConversionePosizione {
	public String[] conversione(String[] dati)	{
		int i, var;
		char temp = 0;
		for(i=0; i<dati.length; i++)	{
			char x = dati[i].charAt(2);
			switch(x)	{
				case 'a': temp = '0'; break;
				case 'b': temp = '1'; break;
				case 'c': temp = '2'; break;
				case 'd': temp = '3'; break;
				case 'e': temp = '4'; break;
				case 'f': temp = '5'; break;
				case 'g': temp = '6'; break;
				case 'h': temp = '7'; break;
				default: temp = x;
			}
			dati[i] = dati[i].substring(0,2)+ temp + dati[i].substring(3);
			char y = dati[i].charAt(3);
			var = Character.getNumericValue(y);
			if((var>0)&&(var<9))	{
				var--;
				y = Integer.toString(var).charAt(0);
				dati[i] = dati[i].substring(0,3)+ y;
			}	
		}
		return dati;
	}
}
