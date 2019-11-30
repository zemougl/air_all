package com.allair.allairapi.dtos;

public class DtoClient {
	private String nom;
	private String prenom;
	private Long numeross;
	private String adresse;
	private String login;
	private String pass;
	
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
	public Long getNumeross() {
		return numeross;
	}
	public void setNumeross(Long numeross) {
		this.numeross = numeross;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
