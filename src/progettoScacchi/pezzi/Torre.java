package progettoScacchi.pezzi;

import progettoScacchi.*;

public class Torre extends progettoScacchi.Pezzi	{
	Main m = new Main();
	boolean errore;
	public void torreBianca(int countTorriBianche, char x, char y)	{
		if(countTorriBianche < 3)	{
			String nome = "torre bianca";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo due torri bianche");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
	public void torreNera(int countTorriNere, char x, char y)	{
		if(countTorriNere < 3)	{
			String nome = "torre nera";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo due torri nere");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
}
