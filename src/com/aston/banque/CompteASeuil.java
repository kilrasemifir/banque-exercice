package com.aston.banque;

public class CompteASeuil extends Compte {

	private double seuil;
	
	public CompteASeuil(int numero, double solde, double seuil) {
		super(numero, solde);
		this.seuil = seuil;
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	@Override
	public void retirer(double unMontant) {
		// cond ? vrai : faux
		//super.retirer(this.getSolde()-unMontant > this.seuil? unMontant: 0);
		if (this.getSolde()-unMontant > this.seuil) {
			super.retirer(unMontant);
		}
		
	}
	
	public String toString() {
		return super.toString() + " seuil" + this.seuil;
	}
	
	

}
