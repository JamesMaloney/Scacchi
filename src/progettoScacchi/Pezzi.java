package progettoScacchi;

import java.io.IOException;

import progettoScacchi.pezzi.*;

public class Pezzi {
	int countAlfieriBianchi, countAlfieriNeri;
	int countCavalliBianchi, countCavalliNeri;
	int countDonneBianche, countDonneNere;
	int countPedoniBianchi, countPedoniNeri;
	int countReBianchi, countReNeri;
	int countTorriBianche, countTorriNere;
	public void creaAlfiere(char colore, char x, char y) throws IOException	{
		Alfiere a = new Alfiere();
		if(colore == 'B')	{
			countAlfieriBianchi++;
			a.alfiereBianco(countAlfieriBianchi, x, y);
		}
		else if(colore == 'N')	{
			countAlfieriNeri++;
			a.alfiereNero(countAlfieriNeri, x, y);
		}
	}
	public void creaCavallo(char colore, char x, char y) throws IOException	{
		Cavallo c = new Cavallo();
		if(colore == 'B')	{
			countCavalliBianchi++;
			c.cavalloBianco(countCavalliBianchi, x, y);
		}
		else if(colore == 'N')	{
			countCavalliNeri++;
			c.cavalloNero(countCavalliNeri, x, y);
		}
	}
	public void creaDonna(char colore, char x, char y) throws IOException	{
		Donna d = new Donna();
		if(colore == 'B')	{
			countDonneBianche++;
			d.donnaBianca(countDonneBianche, x, y);
		}
		else if(colore == 'N')	{
			countDonneNere++;
			d.donnaNera(countDonneNere, x, y);
		}
	}
	public void creaPedone(char colore, char x, char y) throws IOException	{
		Pedone p = new Pedone();
		if(colore == 'B')	{
			countPedoniBianchi++;
			p.pedoneBianco(countPedoniBianchi, x, y);
		}
		else if(colore == 'N')	{
			countPedoniNeri++;
			p.pedoneNero(countPedoniNeri, x, y);
		}
	}
	public void creaRe(char colore, char x, char y) throws IOException	{
		Re r = new Re();
		if(colore == 'B')	{
			countReBianchi++;
			r.reBianco(countReBianchi, x, y);
		}
		else if(colore == 'N')	{
			countReNeri++;
			r.reNero(countReNeri, x, y);
		}
	}
	public void creaTorre(char colore, char x, char y) throws IOException	{
		Torre t = new Torre();
		if(colore == 'B')	{
			countTorriBianche++;
			t.torreBianca(countTorriBianche, x, y);
		}
		else if(colore == 'N')	{
			countTorriNere++;
			t.torreNera(countTorriNere, x, y);
		}
	}
}
