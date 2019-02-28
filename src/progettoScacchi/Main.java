package progettoScacchi;

import java.io.IOException;

public class Main {
	static Scacchiera sc = new Scacchiera();
	public static void main(String[] args) throws IOException	{
		sc.creaScacchiera();
		final InserimentoNuovoPezzo inp = new InserimentoNuovoPezzo();
		inp.inserimento();
	}
	public void aggiungiPezzo(String nome, char x, char y)	{
		sc.aggiungiPezzo(nome, x, y);
	}
	public void segnalaErrore(boolean errore)	{
		sc.segnalaErrore(errore);
	}
	public void aggiungiNuovoPezzo(char pezzo, char colore, char x, char y) throws IOException	{
		switch(pezzo)	{
			case 'A': sc.aggiungiNuovoAlfiere(colore, x, y); break;
			case 'C': sc.aggiungiNuovoCavallo(colore, x, y); break;
			case 'D': sc.aggiungiNuovaDonna(colore, x, y); break;
			case 'P': sc.aggiungiNuovoPedone(colore, x, y); break;
			case 'R': sc.aggiungiNuovoRe(colore, x, y); break;
			case 'T': sc.aggiungiNuovaTorre(colore, x, y); break;
		}
	}
	public void resetErrori()	{
		sc.resetErrori();
	}
	public boolean controlloNuoviErrori()	{
		return sc.controlloNuoviErrori();
	}
}
