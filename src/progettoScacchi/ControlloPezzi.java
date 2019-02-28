package progettoScacchi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ControlloPezzi {
	Vector<String> vectorDati = new Vector<String>();
	int i = 1;
	boolean errore;
	public void lettura() throws IOException	{
		FileReader lettura = null;
		try {
			lettura = new FileReader("pezzi.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File pezzi.txt non trovato");
			System.exit(0);
		}
		BufferedReader in = new BufferedReader(lettura);
		String line = null;
		while((line = in.readLine())!=null)	{
			if(line.length() == 4)	{
				vectorDati.add(line);
				i++;
			}
			else	{
				System.out.println("Errore: la riga " + i + ", \"" + line + "\", è di lunghezza errata!");
				errore = true;
				i++;
				}
		}
		in.close();
		if(errore == true)	{
			System.exit(0);
		}
	}
	public String[] vectorToArray()	{
		return vectorDati.toArray(new String[vectorDati.size()]);
	}
	public String[] controllo(String[] dati)	{
		for(i=0; i<dati.length; i++)	{
			char pezzo = dati[i].charAt(0);
			char colore = dati[i].charAt(1);
			char colonna = dati[i].charAt(2);
			char riga = dati[i].charAt(3);
			if((pezzo != 'A')&&(pezzo != 'C')&&(pezzo != 'D')&&(pezzo != 'P')&&(pezzo != 'R')&&(pezzo != 'T'))	{
				if(dati.length == 1)	{
					System.out.println("Errore: il pezzo \""  + pezzo + "\" non è valido!");
				}
				else	{
					System.out.println("Errore: il pezzo \""  + pezzo + "\" alla riga " + (i+1) + " non è valido!");
				}
				errore = true;
			}
			if((colore != 'B')&&(colore != 'N'))	{
				if(dati.length == 1)	{
					System.out.println("Errore: il pezzo ha un colore \"" + colore + "\" non valido!");
				}
				else	{
					System.out.println("Errore: il pezzo alla riga " + (i+1) + " ha un colore \"" + colore + "\" non valido!");
				}
				errore = true;
			}
			if((Character.getNumericValue(colonna) > 8)||(Character.getNumericValue(colonna) < 0))	{
				if(dati.length == 1)	{
					System.out.println("Errore: il pezzo ha una posizione \"" + colonna + "\" non valida!");
				}
				else	{
					System.out.println("Errore: il pezzo alla riga " + (i+1) + " ha una posizione \"" + colonna + "\" non valida!");
				}
				errore = true;
			}
			if((Character.getNumericValue(riga) > 8)||(Character.getNumericValue(riga) < 0))	{
				if(dati.length == 1)	{
					System.out.println("Errore: il pezzo ha una posizione \"" + riga + "\" non valida!");
				}
				else	{
					System.out.println("Errore: il pezzo alla riga " + (i+1) + " ha una posizione \"" + riga + "\" non valida!");
				}
				errore = true;
			}
		}
		if(errore == true)	{
			dati = null;
		}
		return dati;
	}
}
