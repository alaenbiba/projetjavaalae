package New;

public class allocation {
	public client client1;
	public film film1;
	public Date datedebut;
	public Date datefin;
	public allocation(client client1, film film1 , Date datedebut, Date datefin) {
		this.client1 = client1;
		this.datedebut=datedebut;
		this.datefin = datefin;
		this.film1 = film1;
	}
	public void afficher() {
		System.out.println("le client de code " + client1.code_clt + " a allouer le film " + film1.nom_film + " dans la date " + datedebut + " jusqu'a " + datefin );
	}
	public film getfilm1() {
		return film1;
		}
	public Date getdatedebut() {
		return datedebut;
		}
	public Date getdatefin() {
		return datefin;
		}
	public client getclient() {
		return client1;
		}
	
}
