package com.aston.banque;

public interface ICompteRemunere {

	public double calculerInterets();
	public void verserInterets();
	public double getTaux();
	public void setTaux(double taux);
	
}
