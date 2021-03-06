package com.aston.banque;

public class CompteASeuilRemunere extends CompteRemunure implements ICompteASeuil {

	private double seuil;
	public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
		super(numero, solde, taux);
		this.seuil = seuil;
	}

	@Override
	public double getSeuil() {
		// TODO Auto-generated method stub
		return this.seuil;
	}

	@Override
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	@Override
	public void retirer(double unMontant) throws BanqueException{
		if (this.getSolde()-unMontant > this.seuil) {
			super.retirer(unMontant);
		}else {
			throw new BanqueException("Vous n'avez pas assez d'argent. "
					+ "Votre solde:"+this.getSolde() 
					+ "votre seuil:"+this.getSeuil() 
					+" montant:"+unMontant);
		}
	}

}
