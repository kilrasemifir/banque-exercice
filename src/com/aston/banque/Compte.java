package com.aston.banque;

public class Compte {

	private int numero;
	private double solde;
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSolde() {
		return solde;
	}
	
	public void ajouter(double unMontant) {
		this.solde += unMontant;
	}
	
	public void retirer(double unMontant) {
		this.solde -= unMontant;
	}
	
	public String toString() {
		return "Compte "+this.numero+" sold:"+this.solde;
	}

	
	
}
