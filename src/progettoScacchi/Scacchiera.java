package progettoScacchi;

import java.io.IOException;

public class Scacchiera {
	Pezzi p = new Pezzi();
	String[] dati;
	String[][] scacchiera = new String[8][8];
	boolean errore;
	public void creaScacchiera() throws IOException	{
		ControlloPezzi cp = new ControlloPezzi();
		cp.lettura();
		dati = cp.vectorToArray();
		ConversionePosizione conv = new ConversionePosizione();
		dati = conv.conversione(dati);
		dati = cp.controllo(dati);
		if(dati == null)	{
			System.exit(0);
		}
		for(int i=0; i<dati.length; i++)	{
			switch(dati[i].charAt(0))	{
				case 'A': p.creaAlfiere(dati[i].charAt(1), dati[i].charAt(2), dati[i].charAt(3)); break;
				case 'C': p.creaCavallo(dati[i].charAt(1), dati[i].charAt(2), dati[i].charAt(3)); break;
				case 'D': p.creaDonna(dati[i].charAt(1), dati[i].charAt(2), dati[i].charAt(3)); break;
				case 'P': p.creaPedone(dati[i].charAt(1), dati[i].charAt(2), dati[i].charAt(3)); break;
				case 'R': p.creaRe(dati[i].charAt(1), dati[i].charAt(2), dati[i].charAt(3)); break;
				case 'T': p.creaTorre(dati[i].charAt(1), dati[i].charAt(2), dati[i].charAt(3)); break;
			}
		}
		if(errore == true)	{
			System.exit(0);
		}
		System.out.println("La configurazione è valida!");
	}
	public void aggiungiPezzo(String nome, char x, char y)	{
		int posx = Character.getNumericValue(x);
		int posy = Character.getNumericValue(y);
		if(scacchiera[posx][posy] == null)	{
			scacchiera[posx][posy] = nome;
		}
		else	{
			System.out.println("Errore: il pezzo \"" + nome + "\" è nella stessa casella del pezzo \"" + scacchiera[posx][posy] + "\"");
			switch(nome)	{
				case "alfiere bianco": p.countAlfieriBianchi--; break;
				case "alfiere nero": p.countAlfieriNeri--; break;
				case "cavallo bianco": p.countCavalliBianchi--; break;
				case "cavallo nero": p.countCavalliNeri--; break;
				case "donna bianca": p.countDonneBianche--; break;
				case "donna nera": p.countDonneNere--; break;
				case "pedone bianco": p.countPedoniBianchi--; break;
				case "pedone nero": p.countPedoniNeri--; break;
				case "re bianco": p.countReBianchi--; break;
				case "re nero": p.countReNeri--; break;
				case "torre bianca": p.countTorriBianche--; break;
				case "torre nera": p.countTorriNere--; break;
			}
			errore = true;
		}
	}
	public void segnalaErrore(boolean errore)	{
		this.errore = errore;
	}
	public void resetErrori()	{
		errore = false;
	}
	public void aggiungiNuovoAlfiere(char colore, char x, char y) throws IOException	{
		p.creaAlfiere(colore, x, y);
	}
	public void aggiungiNuovoCavallo(char colore, char x, char y) throws IOException	{
		p.creaCavallo(colore, x, y);
	}
	public void aggiungiNuovaDonna(char colore, char x, char y) throws IOException	{
		p.creaDonna(colore, x, y);
	}
	public void aggiungiNuovoPedone(char colore, char x, char y) throws IOException	{
		p.creaPedone(colore, x, y);
	}
	public void aggiungiNuovoRe(char colore, char x, char y) throws IOException	{
		p.creaRe(colore, x, y);
	}
	public void aggiungiNuovaTorre(char colore, char x, char y) throws IOException	{
		p.creaTorre(colore, x, y);
	}
	public boolean controlloNuoviErrori()	{
		return this.errore;
	}
}
