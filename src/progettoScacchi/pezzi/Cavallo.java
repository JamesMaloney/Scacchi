package progettoScacchi.pezzi;

import progettoScacchi.*;

public class Cavallo extends progettoScacchi.Pezzi {
	Main m = new Main();
	boolean errore;
	public void cavalloBianco(int countCavalliBianchi, char x, char y)	{
		if(countCavalliBianchi < 3)	{
			String nome = "cavallo bianco";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo due cavalli bianchi");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
	public void cavalloNero(int countCavalliNeri, char x, char y)	{
		if(countCavalliNeri < 3)	{
			String nome = "cavallo nero";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo due cavalli neri");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
}
