package progettoScacchi.pezzi;

import progettoScacchi.*;

public class Donna extends progettoScacchi.Pezzi {
	Main m = new Main();
	boolean errore;
	public void donnaBianca(int countDonneBianche, char x, char y)	{
		if(countDonneBianche == 1)	{
			String nome = "donna bianca";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci può essere al massimo una donna bianca");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
	public void donnaNera(int countDonneNere, char x, char y)	{
		if(countDonneNere == 1)	{
			String nome = "donna nera";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci può essere al massimo una donna nera");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
}
