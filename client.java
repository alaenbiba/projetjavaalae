package New;

public class client {
	public int code_clt;
	private String nom,prenom,cincl;
	public client(int code_clt, String nom, String prenom, String cincl) {
		this.code_clt=code_clt;
		this.cincl = cincl;
		this.nom = nom;
		this.prenom =prenom;
	}
	
	public void afficher() {
		System.out.println("le client de code  " + code_clt + "  de nom et prenom  " + nom + " " + prenom + "  et de code cin : " + cincl );
	}
	
	public String getcin() {
		return cincl;
	}

	public void setcin(String cin) {
		this.cincl = cin;
		
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
	public int getcode_clt() {
		return code_clt;
	}

	public void setcode_clt(int code_clt) {
		this.code_clt = code_clt;
		}
	
	
	

}
