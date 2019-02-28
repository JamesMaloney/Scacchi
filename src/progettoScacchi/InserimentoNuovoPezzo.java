package progettoScacchi;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class InserimentoNuovoPezzo {
	Scanner in = new Scanner(System.in);
	boolean errore;
	String[] nuovo, nuovoConv;
	public void inserimento() throws IOException	{
		System.out.printf("Inserire un nuovo pezzo (oppure digitare 0 per uscire):");
		String input = in.next();
		if(input.equals("0") == true)	{
			in.close();
			System.exit(0);
		}
		if(input.length() != 4)	{
			System.out.println("Errore: il pezzo inserito ha una lunghezza non valida!");
			inserimento();
		}
		nuovo = new String[1];
		nuovoConv = new String[1];
		nuovo[0] = input;
		nuovoConv[0] = nuovo[0];
		ConversionePosizione conv = new ConversionePosizione();
		nuovoConv = conv.conversione(nuovoConv);
		ControlloPezzi cp = new ControlloPezzi();
		nuovoConv = cp.controllo(nuovoConv);
		if(nuovoConv == null)	{
			inserimento();
		}
		Main m = new Main();
		m.resetErrori();
		m.aggiungiNuovoPezzo(nuovoConv[0].charAt(0), nuovoConv[0].charAt(1), nuovoConv[0].charAt(2), nuovoConv[0].charAt(3));
		errore = m.controlloNuoviErrori();
		if(errore == true)	{
			inserimento();
		}
		Writer out = new BufferedWriter(new FileWriter("pezzi.txt", true));
		out.append("\n" + nuovo[0]);
		out.close();
		System.out.println("Il pezzo inserito è valido ed è stato memorizzato nella configurazione!");
		inserimento();
	}
}
