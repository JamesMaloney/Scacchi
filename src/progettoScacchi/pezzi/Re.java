package progettoScacchi.pezzi;

import progettoScacchi.*;

public class Re extends progettoScacchi.Pezzi {
	Main m = new Main();
	boolean errore;
	public void reBianco(int countReBianchi, char x, char y)	{
		if(countReBianchi == 1)	{
			String nome = "re bianco";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci può essere al massimo un re bianco");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
	public void reNero(int countReNeri, char x, char y)	{
		if(countReNeri == 1)	{
			String nome = "re nero";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci può essere al massimo un re nero");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
}
