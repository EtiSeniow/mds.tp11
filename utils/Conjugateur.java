package tp11.utils;

import java.util.ArrayList;

public class Conjugateur {

	private ArrayList<String> listVerbe;
	private final static String TERMINAISON[] = { "e", "es", "ons", "ez", "ent", "eons" };

	public Conjugateur() {
		this.listVerbe = new ArrayList<String>();
	}

	public void setListVerbe(ArrayList<String> listVerbe) {
		this.listVerbe = listVerbe;
	}

	public void conjugueAvecSaisi() {
		for (String str : this.listVerbe) {
			String verbe = str.substring(0, str.length() - 2);
			System.out.println("je " + verbe + TERMINAISON[0]);
			System.out.println("tu " + verbe + TERMINAISON[1]);
			System.out.println("il " + verbe + TERMINAISON[0]);

			if (str.substring(str.length() - 3, str.length() - 2).equals("g")) {
				System.out.println("nous " + verbe + TERMINAISON[5]);
			} else {
				System.out.println("nous " + verbe + TERMINAISON[2]);
			}

			System.out.println("vous " + verbe + TERMINAISON[3]);
			System.out.println("ils " + verbe + TERMINAISON[4]);
			System.out.println("");
		}
	}

}
