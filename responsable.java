package New;

public class responsable {
	private String nom , prenom, cin;
	private Date date_denaissance;
	public responsable (String nom, String prenom, String cin , Date date_denaissance ) {
		this.cin = cin;
		this.date_denaissance = date_denaissance;
		this.nom = nom;
		this.prenom = prenom;
		
		}
	public void afficher() {
		System.out.println("le responsable " + nom + " " + prenom + " de cin " + cin + " et de date de naissance " + date_denaissance );
	}
	public int calculAge(int anneeA) {
		
		return anneeA - date_denaissance.getAnnee() ; 
	}
	
	
	
	public String getnom() {
		return nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
		
	}
	
	public String getprenom() {
		return prenom;
	}

	public void setprenom(String prenom) {
		this.prenom = prenom;	
	}
	
	
	public String getcin() {
		return cin;
	}

	public void setcin(String cin) {
		this.cin = cin;
		
	}
	public Date getdate_denaissance() {
		return date_denaissance;
	}

	public void setdate_denaissance(Date date_denaissance) {
		this.date_denaissance = date_denaissance;
	}
	


}
