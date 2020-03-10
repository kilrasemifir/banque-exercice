package com.aston.banque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

	private String nom, prenom;
	private int age, numero;
	/*
	 * int -> Integer
	 * float -< Float
	 * boolean -> Boolean
	 * char -> Character
	 * long -> Long
	 * void -> Void
	 */
	private Map<Integer, Compte> comptes = new HashMap<Integer, Compte>();
	
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

	public Map<Integer,Compte> getComptes() {
		return comptes;
	}

	public void ajouterCompte(Compte unCompte) throws BanqueException {
		if (this.comptes.size() < 5) {
			this.comptes.put(unCompte.getNumero(), unCompte);
		}else {
			throw new BanqueException("Vous ne pouvez pas avoir plus de 5 comptes");
		}
	}
	
	public Compte getCompte(int numero) {
		return this.comptes.getOrDefault(numero, null);
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ comptes + "]";
	}
	
	
	
	
}
