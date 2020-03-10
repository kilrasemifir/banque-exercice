package com.aston.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {

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
	
	public String toString() {
		return super.toString() + " seuil" + this.seuil;
	}
	
	

}
