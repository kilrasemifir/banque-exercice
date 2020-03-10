package com.aston.banque;

import java.util.Arrays;

public class Client {

	private String nom, prenom;
	private int age, numero;
	private Compte[] comptes = new Compte[5];
	
	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getNumero() {
		return numero;
	}



	public Compte[] getComptes() {
		return comptes;
	}



	public void ajouterCompte(Compte unCompte) {
		for(int i = 0; i<5; i++) {
			if (this.comptes[i] ==null) {
				this.comptes[i] = unCompte;
				return;
			}
		}
		System.err.println("Plus de place");
	}
	
	public Compte getCompte(int numero) {
		for(Compte compte: this.comptes) {
			if (compte != null && compte.getNumero() == numero) {
				return compte;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ Arrays.toString(comptes) + "]";
	}
	
	
	
	
}
