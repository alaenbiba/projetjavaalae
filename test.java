package New;

public class test {
	

	public static void main(String[] args) {
		client c1 = new client(123,"alae","nbiba","123456789");
		c1.afficher();
		film f1 = new film("the hunger games", "bien",16, new Date(23, 11, 2023)  );
		f1.afficher();
		responsable r1 = new responsable ("ali","benfoulen","123456789",new Date(10,20,2003));
		r1.afficher();
		allocation a1 = new allocation(c1,f1,new Date (10,01,2023), new Date (10,02,2023));
		a1.afficher();
}		
}