package com.aston.banque;

public class CompteRemunure extends Compte {

	private double taux;
	public CompteRemunure(int numero, double solde, double taux) {
		super(numero, solde);
		this.setTaux(taux);
	}
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		if (taux < 0.0)
			this.taux = 0.0;
		else if(taux > 1.0)
			this.taux = 1.0;
		else 
			this.taux = taux;
	}

	public double calculerIntererts() {
		return this.taux * this.getSolde();
	}
	
	public void verserInterets() {
		this.ajouter(this.calculerIntererts());
	}
	
	public String toString() {
		return super.toString() + "taux: " + this.taux;
	}

}
