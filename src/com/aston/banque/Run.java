package com.aston.banque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Client cli = new Client("toto", "tata", 1, 1);
		cli.ajouterCompte(new CompteASeuil(1, 10, 1));
		cli.ajouterCompte(new CompteRemunure(2, 1000, 0.02));
		cli.ajouterCompte(new CompteASeuilRemunere(3, 1000, 0.02, 1));
		verser(cli);
		System.out.println(cli);
		try {
			new CompteASeuil(4, 10, 2).retirer(30);
		} catch (BanqueException e) {
			e.printStackTrace();
		}
	}
	
	private static void verser(Client cli) {
		for(Compte cmp : cli.getComptes()) {
			if (cmp instanceof ICompteRemunere) {
				((CompteRemunure) cmp).verserInterets();
			}
		}
	}
	
	private static void verserStream(Client cli) {
		//cli.getComptes()
	}
}