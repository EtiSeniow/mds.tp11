package tp11;

import java.util.ArrayList;
import java.util.Scanner;

import tp11.utils.Conjugateur;

public class Launcher {

	public static void main(String[] args) {

		Conjugateur conj = new Conjugateur();
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		ArrayList<String> verbes = new ArrayList<String>();
		ArrayList<String> newVerbes = new ArrayList<String>();

		verbes.add("Manger");
		verbes.add("Chercher");
		verbes.add("prononcer");

		conj.setListVerbe(verbes);

		conj.conjugueAvecSaisi();

		do {
			System.out.println("Saisir un regulier verbe de 1er groupe :");
			tmp = sc.next();
		} while (tmp.substring(tmp.length() - 2, tmp.length()).equals("er") == false || tmp.equals("aller"));
		
		newVerbes.add(tmp);
		conj.setListVerbe(newVerbes);
		conj.conjugueAvecSaisi();

	}

}
