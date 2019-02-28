package progettoScacchi.pezzi;

import progettoScacchi.*;

public class Alfiere extends progettoScacchi.Pezzi {
	Main m = new Main();
	boolean errore;
	public void alfiereBianco(int countAlfieriBianchi, char x, char y)	{
		if(countAlfieriBianchi < 3)	{
			String nome = "alfiere bianco";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo due alfieri bianchi");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
	public void alfiereNero(int countAlfieriNeri, char x, char y)	{
		if(countAlfieriNeri < 3)	{
			String nome = "alfiere nero";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo due alfieri neri");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
}
