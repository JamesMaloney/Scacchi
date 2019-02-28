package progettoScacchi.pezzi;

import progettoScacchi.*;

public class Pedone extends progettoScacchi.Pezzi {
	Main m = new Main();
	boolean errore;
	public void pedoneBianco(int countPedoniBianchi, char x, char y)	{
		if(countPedoniBianchi<=8)	{
			String nome = "pedone bianco";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo otto pedoni bianchi");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
	public void pedoneNero(int countPedoniNeri, char x, char y)	{
		if(countPedoniNeri<=8)	{
			String nome = "pedone nero";
			m.aggiungiPezzo(nome, x, y);
		}
		else	{
			System.out.println("Errore: in una scacchiera ci possono essere al massimo otto pedoni neri");
			errore = true;
			m.segnalaErrore(errore);
		}
	}
}
