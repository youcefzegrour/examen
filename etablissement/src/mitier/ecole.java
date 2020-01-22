package mitier;


public class ecole {

		public ecole() {
		super();
		// TODO Auto-generated constructor stub
	}
		public ecole(String nom, String mail, String adresse, String tel, String directeur) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.directeur = directeur;
	}
		private String nom;
		private String mail;
		private String adresse;
		private String tel;
		private String directeur;
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
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
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getDirecteur() {
			return directeur;
		}
		public void setDirecteur(String directeur) {
			this.directeur = directeur;
		}
		@Override
		public String toString() {
			return "ecole [nom=" + nom + ", mail=" + mail + ", adresse=" + adresse + ", tel=" + tel + ", directeur="
					+ directeur + "]";
		}


}
