package mitier;

import java.util.Date;

public class enseingant {
	public enseingant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public enseingant(String id, String nom, String prenom, String mail, String adresse, int tel, String matiere) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.matiere = matiere;
	}
	private String id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private int tel;
	private String matiere;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	@Override
	public String toString() {
		return "enseingant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse="
				+ adresse + ", tel=" + tel + ", matiere=" + matiere + "]";
	}
	}



