package New;

public class film {
	public String nom_film, avis;
	public int tarif;
	public Date date_de_sortie;
	public film (String nom_film, String avis, int tarif ,Date date_de_sortie) {
		this.avis =avis;
		this.date_de_sortie =date_de_sortie;
		this.nom_film=nom_film;
		this.tarif =tarif;
	}
	public void afficher() {
		System.out.println("film " + nom_film + " de date de sortie " + date_de_sortie + "  d'avis : " + avis + " et de prix  : " + tarif + "DT" ); 
	}
		public Date getdate_de_sortie() {
			return date_de_sortie;
		}
		

		public void setdate_de_sortie(Date date_de_sortie) {
			this.date_de_sortie = date_de_sortie;
		}
		public String getnom_film() {
			return nom_film;
		}

		public void setnom_film(String nom_film) {
			this.nom_film = nom_film;
			
		}
		public String getavis() {
			return avis;
		}

		public void setavis(String avis) {
			this.avis = avis;
			
		}
		public int gettarif() {
			return tarif;
		}

		public void settarif(int tarif) {
			this.tarif = tarif;
		}
	
}
